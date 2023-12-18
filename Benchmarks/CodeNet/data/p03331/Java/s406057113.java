import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        System.out.println(solve(N));
    }
    public static int solve(int N) {
        int answer = Integer.MAX_VALUE;
        for (int a = 1; a < N; a++) {
            int b = N - a;
            if (b < a) {
                break;
            }
            String a_s = Integer.valueOf(a).toString();
            String b_s = Integer.valueOf(b).toString();
            answer = Math.min(answer, sum(a_s, b_s));
        }
        return answer;
    }
    private static int sum(String a_s, String b_s) {
        char[] a_c = a_s.toCharArray();
        char[] b_c = b_s.toCharArray();
        int sum = 0;
        for(char c : a_c) {
            sum += (int) c - 48;
        }
        for(char c : b_c) {
            sum += (int) c - 48;
        }
        return sum;
    }
}
