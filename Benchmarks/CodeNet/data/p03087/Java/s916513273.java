import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private void solve() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Q = sc.nextInt();
        String S = sc.next();
        char[] SCharArray = S.toCharArray();
        int[] left = new int[Q];
        int[] right = new int[Q];
        for (int i = 0; i < Q; i++) {
            left[i] = sc.nextInt();
            right[i] = sc.nextInt();
        }

        int[] accumCounts = new int[N];
        for (int i = 0; i < N - 1; i++) {
            if (SCharArray[i] == 'A' && SCharArray[i + 1] == 'C') {
                accumCounts[i + 1] = (accumCounts[i] + 1);
            }
            else {
                accumCounts[i + 1] = accumCounts[i];
            }
        }
        //accumCounts[N - 1] = accumCounts[N - 2];

        //for (int i = 0; i < N; i++) {
        //   System.out.println(accumCounts[i]);
        //}
        for (int i = 0; i < Q; i++) {
            System.out.println(accumCounts[right[i] - 1] - accumCounts[left[i] - 1]);
        }
    }

    // Main
    public static void main(String[] args) {
        new Main().solve();
    }

}
