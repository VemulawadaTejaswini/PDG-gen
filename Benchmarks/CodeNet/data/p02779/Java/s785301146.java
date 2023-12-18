    import java.util.*;
    public class Main{
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            int N=sc.nextInt();
            int A[];
            A=new int[N];
            for(int i=0;i<N;i++) A[i]=sc.nextInt();
            Arrays.sort(A);
            boolean ans=true;
            for(int i=0;i<N-1;i++) if(A[i]==A[i+1]) ans=false;
            System.out.println(ans?"YES":"NO");
        }
    }