
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        int[] dices = new int[N];

        for (int i = 0; i < N; i++) {
            dices[i] = sc.nextInt();
        }

        Map<Integer,Double> means = new HashMap<>();
        double answerExpectedValue = 0;

        int current = 0;
        while(current + K <= N){
            double x = 0;
            for(int i = 0; i < K; i++){
                int dice = dices[i + current];
                if(means.containsKey(dice)){
                    x += means.get(dice);
                    continue;
                }
                double mean = mean(dices[i + current]);
                x += mean;
                means.put(dice, mean);
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
