import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        long Answer = 1;
        boolean ans = true;
        int An[] = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
            An[A[i]]++;
            if (N % 2 == 0 && A[i] % 2 == 0) {
                ans = false;
            } else if (N % 2 == 1 && A[i] % 2 == 1) {
                ans = false;
            }
        }
        if (N % 2 == 1 && ans == true) {
            for (int i = 0; i < N; i = i + 2) {
                if (i == 0 && An[i] != 1) {
                    ans = false;
                    break;
                } else if (i != 0 && An[i] != 2) {
                    ans = false;
                    break;
                }
                if (i != 0) {
                    Answer = Answer * 2 % 1000000007;
                }
            }
        } else if (ans == true) {
            for (int i = 1; i < N; i = i + 2) {
                if (An[i] != 2) {
                    ans = false;
                    System.out.println(i);
                    break;
                }
                Answer = Answer * 2 % 1000000007;
            }
        }
        if (ans) {
            System.out.println(Answer);
        } else {
            System.out.println("0");
        }
    }
}