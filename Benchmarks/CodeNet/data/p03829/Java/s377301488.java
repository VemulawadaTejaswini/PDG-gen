import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        int A = scan.nextInt();
        int B = scan.nextInt();
        long[] x = new long[N];
        for (int i = 0 ; i < N; i++) {
            x[i] = scan.nextLong();
        }
        long answer = 0;
        for (int i = 0; i < N-1; i++) {
            answer += Math.min(B, (x[i+1]-x[i])*A);
        }
        System.out.println(answer);
    }
}
