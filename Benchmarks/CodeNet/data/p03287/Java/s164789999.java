import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int N=sc.nextInt();
        int M=sc.nextInt();
        double[] A=new double[N];
        int cnt=0;
        Double sum;

        for(int i=0;i<N;i++){
            A[i]=sc.nextDouble();
        }
        for(int i=0;i<N;i++){
            sum=0.0;
            for(int j=i;j<N;j++){
                sum+=A[j];
                if(sum%M==0){
                    cnt++;
                }
            }
        }
        System.out.println(""+cnt);
    }
}