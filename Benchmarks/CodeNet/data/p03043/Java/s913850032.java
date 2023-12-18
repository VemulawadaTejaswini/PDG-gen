import java.util.*;

public class Main {

    static int N;
    static int K;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        N = scanner.nextInt();
        K = scanner.nextInt();

        double acc = 0;

        double baseProb = (double) 1 / N;

        for(int i=1; i<=N; i++){
            if(i >= K){
                acc += baseProb;
            }else{
                acc += baseProb * powerProb(i);
            }
        }

        System.out.println(acc);
    }

    private static double powerProb(int target) {
        double ret = 1;

        while(target <= K-1){
            target *= 2;
            ret *= 0.5;
        }

        return ret;
    }
}
