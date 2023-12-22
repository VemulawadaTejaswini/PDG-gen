import java.util.*;
class Main{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args){
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] H = new int[N+1];
        int[] A = new int[N];
        int[] B = new int[N];
        int temp = 0;
        for(int i=1;i<=N;i++)
            H[i]=sc.nextInt();
        for(int i=0;i<M;i++){
            A[i]=sc.nextInt();
            B[i]=sc.nextInt();
            if(H[A[i]]<H[B[i]])
            	H[A[i]]=0;
            else H[B[i]]=0;
        }
        for(int i=1;i<=N;i++){
            if(H[i]!=0)
                temp++;
        }
        System.out.println(temp);
    }
}