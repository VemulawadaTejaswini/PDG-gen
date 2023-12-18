import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        long T = scan.nextLong();
        int[] t = new int[N];
        for (int i = 0; i < N; i++) {
            t[i] = scan.nextInt();
        }
        long answer = 0;
        for (int i = 1; i< N; i++) {
            if (t[i-1]+T < t[i]) {
                answer += T;
            } else {
                answer += t[i]-t[i-1];
            }
        }
        answer += T;
        System.out.println(answer);
    }
}
