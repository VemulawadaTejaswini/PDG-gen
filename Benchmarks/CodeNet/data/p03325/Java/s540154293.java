import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        long[] a = new long[N];
        for (int i = 0; i < N; i++) {
            a[i] = scan.nextInt();
        }
        System.out.println(solve(a));
    }
    public static long solve(long[] a) {
        int answer = 0;
        for (int i = 0; i < a.length; i++) {
            answer += sub(a[i]);
        }
        return answer;
    }
    public static long sub(long x) {
        int count = 0;
        while (x % 2 == 0) {
            count += 1;
            x /= 2;
        }
        return count;
    }
}
