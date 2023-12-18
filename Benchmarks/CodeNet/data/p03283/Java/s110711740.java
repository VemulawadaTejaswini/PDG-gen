import java.util.Scanner;

//https://atcoder.jp/contests/abc106/tasks/abc106_d
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int question = sc.nextInt();
        int[] l = new int[m];
        int[] r = new int[m];
        int[] p = new int[question];
        int[] q = new int[question];
        int[] answer = new int[question];

        for (int i = 0; i < m; i++) {
            l[i] = sc.nextInt();
            r[i] = sc.nextInt();
        }
        for (int i = 0; i < question; i++) {
            p[i] = sc.nextInt();
            q[i] = sc.nextInt();
        }

        for (int i = 0; i < question; i++) {
            answer[i] = 0;
            for (int j = 0; j < m; j++) {
                int left = l[j] - p[i];
                int right = q[i] - r[j];

                if (left >= 0 && right >= 0) {
                    answer[i]++;
                }
            }
        }

        for (Integer i : answer) {
            System.out.println(i);
        }

    }
}