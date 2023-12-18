
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        int[] dices = new int[N];

        String answer = "YES";
        for (int i = 0; i < N; i++) {
            dices[i] = sc.nextInt();
        }

        double answerExpectedValue = 0;

        int current = 0;
        while(current + K <= N){
            double x = 0;
            for(int i = 0; i < K; i++){
                x += mean(dices[i + current]);
            }
            if (x > answerExpectedValue){
                answerExpectedValue = x;
            }
            current ++;
        }
        System.out.println(answerExpectedValue);
    }

    private static double mean(int n){
        int x = 0;
        for(int i=1; i <= n; i ++){
            x += i;
        }
        return (double)x / n;
    }

}
