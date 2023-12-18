import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        String S = scan.next();
        char[] data = S.toCharArray();
        int answer = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            answer = Math.min(sub(N, data, i), answer);
        }
        System.out.println(answer);
    }
    public static int sub(int N, char[] data, int from) {
        int answer = 0;
        for (int i = 0; i < N; i++) {
            if (i <= from) {
                if (data[i] == '#') {
                    answer += 1;
                }
            } else {
                if (data[i] == '.') {
                    answer += 1;
                }
            }
        }
        return answer;
    }
}
