import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        double prob = 0;

        for (int i = 1; i <= n; i++){
            // 最初のサイコロの目について、確率を計算する
            prob = prob + eachProb(i, k);
        }

        System.out.println(prob / (double) n);
    }

    private static double eachProb(int deme, int k){
        if (deme >= k){
            return 1;
        }

        for (int i = 1; i < 100; i++){
            if (deme * Math.pow(2, i) >= k){
                return 1/ Math.pow(2, i);
            }
        }
        // 実質的にここは通らないはず
        return 0;

    }
}