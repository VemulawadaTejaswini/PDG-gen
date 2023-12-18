import java.util.*;
public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int N=sc.nextInt();
        long[] A=new long[N];
        for(int i=0;i<N;i++){
            A[i]=sc.nextInt();
        }
        long[] x=new long[N];//山の雨;
        x[0]=2*A[0];
        for(int i=1;i<N;i++){
            x[i]=(A[i-1]-x[i-1]/2)*2;

        }
        long sub=((x[0]+x[N-1])/2-A[N-1])/2;
        for(int i=0;i<N;i++){
            if(i%2==0){
                System.out.println(x[i]-sub*2);
            }else{
                System.out.println(x[i]+sub*2);

            }
        }


    }
}
