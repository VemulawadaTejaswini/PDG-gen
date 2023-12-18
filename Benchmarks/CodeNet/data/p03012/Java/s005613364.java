import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] w = new int[N];

        for (int i = 0; i < N; i++) {
            w[i] = sc.nextInt();
        }

        int minDiff = 100000;
        for (int t = 1; t < N; t++) {
            int s1 = 0;
            int s2 = 0;
            for (int g1 = 0; g1 < t; g1++) {
                s1 += w[g1];
            }

            for (int g2 = t; g2 < N; g2++) {
                s2 += w[g2];
            }
            
            minDiff = Math.min(Math.abs(s2 - s1), minDiff);
        }
        
        System.out.println(minDiff);
    }
}