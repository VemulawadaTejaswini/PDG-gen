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
        //System.out.println(Arrays.toString(x));
        for(int i = 0;i < 4;i++){
            for(int j = 0;j < K;j++){
                //System.out.printf("x[%d] = %d\n",i,x[i]);
                if(x[i] == d[j]){
                    x[i]++;
                }
                else{
                    break;
                }
            }
        }
        for(int i = 3;i >= 0;i--){
            System.out.print(x[i]);
        }
        System.out.println();
    }
}
