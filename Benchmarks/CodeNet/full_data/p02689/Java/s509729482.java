import java.util.*;
class Main{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args){
        int N = sc.nextInt();
        int M = sc.nextInt();
        long[] H = new long[N+1];
        int[] A = new int[N];
        int[] B = new int[N];
        long[] C = new long[N+1];
        long temp = 0;
        for(int i=1;i<=N;i++){
            H[i]=sc.nextLong();
            C[i]=H[i];
        }
        for(int i=0;i<M;i++){
            A[i]=sc.nextInt();
            B[i]=sc.nextInt();
            if(C[A[i]]<C[B[i]])
                H[A[i]]=0;
            if(C[A[i]]>C[B[i]])
                H[B[i]]=0;
            if(C[A[i]]==C[B[i]]){
                H[A[i]]=0;
                H[B[i]]=0;
            }
        }
        for(int i=1;i<=N;i++){
            //System.out.println(H[i]);
            if(H[i]!=0)
                temp++;
        }
        System.out.println(temp);
    }
}