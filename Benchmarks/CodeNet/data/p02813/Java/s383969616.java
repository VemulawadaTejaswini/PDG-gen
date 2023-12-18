import java.util.*;
public class Main {
    public static void main (String args []){
        Scanner sc = new Scanner(System.in);
        int N =sc.nextInt();
        int num =0;
        int sum =0;
        int [] A = new int[N];
        int [] B = new int[N];
        for(int i=0;i<N;i++)A[i]=sc.nextInt();
        for(int i=0;i<N;i++)B[i]=sc.nextInt();
        ArrayList<Integer> opt = new ArrayList<>();
        for(int i=1;i<=N;i++){
            int [] List = new int[N+1];
            int [] sol = new int[N];
            for(int j=0;j<N;j++) List[j]=0;
            sum = permutation(i,List,sol,num,N,opt,A,B,sum);
        }
        System.out.println(Math.abs(opt.get(0)-opt.get(1)));

    }
    public static int permutation(int now,int [] List,int [] sol,int num ,int N,ArrayList<Integer> opt,int [] A,int [] B,int sum) {
        List[now]=1;
        sol[num]=now;
        num++;
        if(num==N){
            sum++;
            boolean acheck =true;
            boolean bcheck = true;
            for(int i=0;i<N;i++){
                if(sol[i]!=A[i]) acheck=false;
                if(sol[i]!=B[i]) bcheck=false;
            }
            if(acheck||bcheck) opt.add(sum);
        }
        else for(int i=1;i<=N;i++) if(List[i]==0) sum = permutation(i,List,sol,num,N,opt,A,B,sum);
        num--;
        List[now]=0;
        return sum;
    }
}