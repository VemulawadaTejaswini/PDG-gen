import java.util.*;
class Main{
    static Scanner sc=new Scanner(System.in);
    public static int ar(int[] TEL,long K,int from,long t){
        if(t==K+1){
            return TEL[from];
        }
        else{
            t++;
            return ar(TEL,K,TEL[from],t);
        }
    }
    public static void main(String[] args){
        int N = sc.nextInt();
        long K = sc.nextLong();
        int[] A = new int[N+1];
        boolean[] T=new boolean[N+1];
        for(int i=1;i<=N;i++){
            A[i]=sc.nextInt();
            T[i]=true;
        }
        int temp=1;
        int temp1=0;
        while(T[temp]){
            T[A[temp]]=false;
            temp1++;
            temp=A[temp];
        }
        K=K%temp1;
        System.out.println(ar(A,K,1,0));
    }
}