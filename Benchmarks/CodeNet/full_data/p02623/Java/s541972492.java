import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    void solve(Scanner sc, PrintWriter pw) {
        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();
        int[] dataA = new int[N];
        int[] dataB = new int[M];
        for (int i = 0; i < N; i++) {
            dataA[i] = sc.nextInt();
        }

        for (int i = 0; i < M; i++) {
            dataB[i] = sc.nextInt();
        }

        int nextA = 0;
        int nextB = 0;
        int remain = K;
        int result = 0;
        while (nextA < N || nextB < M) {
            if (nextA >= N) {
                if (remain < dataB[nextB]) {
                    break;
                }
                remain -= dataB[nextB];
                nextB++;
                result++;
            } else if (nextB >= M) {
                if (remain < dataA[nextA]) {
                    break;
                }
                remain -= dataA[nextA];
                nextA++;
                result++;
            } else {
                if (dataA[nextA] < dataB[nextB]) {
                    if (remain < dataA[nextA]) {
                        break;
                    }
                    remain -= dataA[nextA];
                    nextA++;
                    result++;
                } else {
                    if (remain < dataB[nextB]) {
                        break;
                    }
                    remain -= dataB[nextB];
                    nextB++;
                    result++;
                }
            }
        }
        pw.println(result);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        new Main().solve(sc, pw);
        pw.flush();
        pw.close();
        sc.close();
    }
}
