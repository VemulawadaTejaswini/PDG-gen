import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt(),k=in.nextInt();

        List<Integer> A=new ArrayList<>();
        for(int i=0;i<n;i++)A.add(Integer.parseInt(in.next()));

        List<Integer> SA=new ArrayList<>();
        for(int i=A.size();i>0;i--){
            for(int j=0;j+i<=A.size();j++){
                int a=sumSubstring(A,j,i);
               // System.out.println(a);
                SA.add(a);
            }
        }
        
        Collections.sort(SA,Collections.reverseOrder());

        int res=SA.get(0);
        for(int i=1;i<k;i++){
            res &= SA.get(i);
        }

        System.out.println(res);
    }

    static int sumSubstring(List<Integer> A,int startposition,int n){
        int res=0;
        for(int i=0;i<n;i++){
            res+=A.get(startposition+i);
        }

        return res;
    }
}