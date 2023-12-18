import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int Q=sc.nextInt();
        int[] A=new int[N];
        for(int i=0;i<N;i++){
            A[N-i-1]=sc.nextInt();
        }
        int[] X=new int[Q];
        for(int i=0;i<Q;i++){
            X[i]=sc.nextInt();
        }
        int border[]=new int[(N+1)/2];
        for(int i=0;i<(N+1)/2;i++){
            border[i]=(A[i]+A[i*2])/2;
        }
        long result[]=new long[(N+1)/2];
        for(int i=0;i<(N+1)/2;i++){
            result[0]+=A[i*2];
        }
        for(int i=1;i<(N+1)/2;i++){
            result[i]=result[i-1]+A[i]-A[2*i];
        }

        StringBuilder resultS=new StringBuilder();
        for(int i=0;i<Q;i++){
            int x1=0;
            int x2=(N+1)/2-1;
            while(true){
                int xm=(x1+x2)/2;
                if(border[xm]>X[i]){
                    x1=xm;
                }else{
                    x2=xm;
                }
                if(x2-x1==1) {
                    break;
                }
            }
            if(border[x2]<X[i]){
                resultS.append(result[x2-1]+"\n");
            }else{
                resultS.append(result[x2]+"\n");
            }
        }




        System.out.println(resultS);
    }



}