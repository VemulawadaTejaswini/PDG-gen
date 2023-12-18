import java.util.*;

public class Main {

    private int N;
    private char[] S;

    public void inputData() {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        S = new char[N];
        for (int i = 0; i < N; i++) {
            S[i] = sc.next().charAt(0);
        }
    }

    public void printAnswer() {
        for (int i = 0; i < N; i++) {
            if (S[i] == 'Y') {
                System.out.println("Four");
                return;
            }
        }
        System.out.println("Three");
    }

    public void run() {
        inputData();
        printAnswer();
    }

    public static void main(String[] args) {
        (new Main()).run();
    }

}
