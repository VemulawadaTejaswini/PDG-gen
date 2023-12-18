import java.util.*;

class Main{
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]){
        int N=sc.nextInt(),K=sc.nextInt(),A[]=new int[N],t=0,res=0;
        if(K==N){
            System.out.println(1);
            return;
        }
        for(int i=0;i<N;i++){
            A[i]=sc.nextInt();
        }
        Arrays.sort(A);
        while(true){
            if(A[t+1]!=A[t]){
                break;
            }
            t++;
        }
        res=((N-t)+(K-1)-1)/(K-1);
        System.out.println(res);
    }
}