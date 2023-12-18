
import java.util.Scanner;

public class Main {

    static double N, K;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextDouble();
        K = sc.nextDouble();
        if(N / K >= 100){
            N -= K * ((int)(N / K) - 100);
        }
        double newN = N;
        while(K / 2 <= newN){
            newN = (newN - K > 0)?(newN - K):(K - newN);
        };
        System.out.println((int)newN);
    }
}
