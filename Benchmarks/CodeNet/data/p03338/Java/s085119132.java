
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        String S = scan.next();
        System.out.println(solve(N, S));
    }
    public static int solve(int N, String S) {
        char[] data = S.toCharArray();
        int answer = 0;
        for (int i = 0; i < N; i++) {
            answer = Math.max(answer, sol(N, data, i));
        }
        return answer;
    }
    public static int sol(int N, char[] data, int position) {
        HashSet<Character> right = new HashSet<>();
        HashSet<Character> left = new HashSet<>();
        for (int i = 0; i < position; i++) {
            right.add(data[i]);
        }
        for (int i = position; i < N; i++) {
            left.add(data[i]);
        }
        right.retainAll(left);
        return right.size();

    }
}

