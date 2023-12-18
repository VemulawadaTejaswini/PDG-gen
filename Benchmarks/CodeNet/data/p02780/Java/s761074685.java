import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        double[] l = new double[n];
        for(int i = 0; i < n; i++){
            l[i] = (sc.nextDouble() + 1) / 2;
        }

        double[] sum = new double[n - k + 1];
        for(int i = 0; i < k; i++){
            sum[0] += l[i];
        }
        for(int i = 1; i < n - k + 1; i++){
            sum[i] = sum[i - 1] + l[k + i - 1] - l[i - 1];
        }
        double max = sum[0];
        for(int i = 1; i < n - k + 1; i++){
            max = Math.max(max, sum[i]);
        }

        System.out.println(max);
        sc.close();
    }
}