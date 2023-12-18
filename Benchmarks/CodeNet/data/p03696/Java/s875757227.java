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
        int head = S.indexOf('(');
        if (head == -1) {
            head = 0;
        }
        int foot = S.lastIndexOf(')');
        if (foot == -1) {
            foot = N - 1;
        }
        int sum = 0;
        for (int i = head; i <= foot; i++) {
            if (S.charAt(i) == '(') {
                sum++;
            } else {
                sum--;
            }
        }
        if (sum > 0) {
            for (int i = 0; i < sum; i++) {
                S += ')';
            }
        } else {
            for (int i = 0; i < -sum; i++) {
                S = '(' + S;
            }
        }
        for (int i = 0; i < head; i++) {
            S = '(' + S;
        }
        for (int i = foot; i < N - 1; i++) {
            S += ')';
        }
        System.out.println(S);
    }
}
