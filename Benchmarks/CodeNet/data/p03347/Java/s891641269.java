import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = scan.nextInt();
        }
        System.out.println(solve(N, a));
    }
    public static int solve(int N, int[] a) {
        if (a[0] > 0) {
            return -1;
        }
        int answer = 0;
        for (int i = 1; i < N; i++) {
            if (a[i-1]+1 < a[i]) {
                return -1;
            }
            if (a[i-1]+1 == a[i]) {
                answer += 1;
                continue;
            }
            answer += a[i];
        }
        return answer;
    }
}
