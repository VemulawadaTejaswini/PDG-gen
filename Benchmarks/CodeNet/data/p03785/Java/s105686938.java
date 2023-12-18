import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        long C = scan.nextLong();
        long K = scan.nextLong();
        long[] l = new long[N];
        for (int i = 0; i < N; i++) {
            l[i] = scan.nextLong();
        }
        Arrays.sort(l);
        long[] r = new long[N];
        for (int i = 0; i < N; i++) {
            r[i] = l[i] + K;
        }
        int answer = 0;
        for (int i = 0; i < N;) {
            int current = i;
            int number_of_people = 0;
            for (int j = current; j < N; j++) {
                if (r[current] < l[j]) {
                    break;
                }
                number_of_people += 1;
                i = j + 1;
                if (number_of_people == C) {
                    break;
                }
            }
            answer += 1;
        }
        System.out.println(answer);
    }
}
