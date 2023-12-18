import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        int M = scan.nextInt();
        int[] L = new int[M];
        int[] R = new int[M];
        int minL = 0;
        int minR = N;
        for (int i = 0; i < M; i++) {
            L[i] = scan.nextInt();
            R[i] = scan.nextInt();
            minL = Math.max(minL, L[i]);
            minR = Math.min(minR, R[i]);
        }
        System.out.println(Math.max(minR - minL + 1, 0));
    }
}
