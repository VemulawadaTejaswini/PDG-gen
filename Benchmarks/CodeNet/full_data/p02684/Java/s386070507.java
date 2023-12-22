import java.util.*;
class Main{
    static Scanner sc=new Scanner(System.in);
    public static int ar(int[] TEL,long K,int from,long t){
        if(t==1+K){
            return TEL[from-1];
        }
        else{
            t++;
            return ar(TEL,K,TEL[from-1],t);
        }
    }
    public static void main(String[] args){
        int N = sc.nextInt();
        long K = sc.nextLong();
        int[] A = new int[N];
        boolean[] T=new boolean[N];
        for(int i=0;i<N;i++){
            A[i]=sc.nextInt();
            T[i]=true;
        }
        int temp=1;
        int temp1=0;
        while(T[temp-1]){
            T[A[temp-1]-1]=false;
            temp1++;
            temp=A[temp-1];
        }
        K=K%temp1;
        System.out.println(ar(A,K,1,0));
    }
}