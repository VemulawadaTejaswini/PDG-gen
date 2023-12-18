import java.util.Scanner;
import java.util.Stack;

class Main {

    public static void main(String[] args) {
        new Main().compute();
    }

    void compute() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
        int head = 0;
        int foot = 0;
        int yoyaku = 0;
        for (int i = 0; i < N; i++) {
            if (S.charAt(i) == '(') {
                yoyaku++;
            } else {
                if (yoyaku > 0) {
                    yoyaku--;
                } else {
                    head++;
                }
            }
        }
        yoyaku = 0;
        for (int i = N - 1; i >= 0; i--) {
            if (S.charAt(i) == '(') {
                if (yoyaku > 0) {
                    yoyaku--;
                } else {
                    foot++;
                }
            } else {
                yoyaku++;
            }
        }
        for (int i = 0; i < head; i++) {
            S = '(' + S;
        }
        for (int i = 0; i < foot; i++) {
            S = S + ')';
        }
        System.out.println(S);
    }
}
