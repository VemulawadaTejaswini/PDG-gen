import java.util.*;
// import java.awt.Point;

public class Main {
    int big =1000000007;
    public Main(){
        int a=1;
        Scanner sc=new Scanner(System.in);

        int N=sc.nextInt();
        int M=sc.nextInt();
        int[] A=new int[N];
        int[] B=new int[M];
        for(int i=0;i<N;i++){
            A[i]=Integer.parseInt(sc.next());
        }
        for(int i=0;i<M;i++){
            B[i]=Integer.parseInt(sc.next());
        }
        Arrays.sort(A);
        Arrays.sort(B);
        long result=1;
        int used=0;
        int Ai=0;int Bi=0;
        while(Ai<N-1||Bi<M-1){
            if(A[Ai]==A[Ai+1]||B[Bi]==B[Bi+1]){
                return;
            }
            if(A[Ai]==B[Bi]){
                result=kaiho(A[Ai]-used-1,M-Bi-1,result);
                used+=M-Bi;
                Ai++;
                result=kaiho(B[Bi]-used,N-Ai,result);
                used+=N-Ai;
                Bi++;
            }else if (A[Ai]<B[Bi]){
                result=(result*(M-Bi))%big;
                result=kaiho(A[Ai]-used-1,M-Bi-1,result);
                used+=M-Bi;
                Ai++;
            }else{
                result=(result*(N-Ai))%big;
                result=kaiho(B[Bi]-used-1,N-Ai-1,result);
                used+=N-Ai;
                Bi++;
            }
        }
        System.out.println(result%big);
        return;

    }
    public long kaiho(int x,int y,long result){
        for(int i=x;i>x-y;i--){
            result=(result*i)% big;
        }
        return result;
    }
    public static void main(String[] args){
        Main main=new Main();
    }

}
