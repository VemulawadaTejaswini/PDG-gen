import java.util.Scanner;
import java.util.Arrays;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] d = new int[N];
        for(int i = 0;i < K;i++){
            d[i] = sc.nextInt();
        }
        int m = 0;
        int[] x = new int[4];
        while(N != 0){
            x[m] = N % 10;
            N /= 10;
            m++;
        }
        for(int i = 0;i < 4;i++){
            for(int j = 0;j < K;j++){
                //System.out.printf("x[%d] = %d\n",i,x[i]);
                //System.out.printf("d[%d] = %d\n",j,d[j]);
                if(x[i] == d[j]){
                    x[i]++;
                    //System.out.printf("x[%d] = %d\n",i,x[i]);
                }
            }
        }
        int sum = 0;
        for(int i = 3;i >= 0;i--){
            sum += x[i];
            if(i == 0){
                break;
            }
            sum *= 10;
        }
        System.out.println(sum);
    }
}
