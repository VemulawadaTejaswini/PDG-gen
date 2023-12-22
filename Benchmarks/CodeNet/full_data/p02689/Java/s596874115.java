import java.util.*;
class Main{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args){
        long N = sc.nextLong();
        long M = sc.nextLong();
        long[] H = new long[N+1];
        long[] A = new long[N];
        long[] B = new long[N];
        long[] C = new long[N+1];
        long temp = 0;
        for(int i=1;i<=N;i++){
            H[i]=sc.nextLong();
            C[i]=H[i];
        }
        for(int i=0;i<M;i++){
            A[i]=sc.nextLong();
            B[i]=sc.nextLong();
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