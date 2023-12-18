import java.util.*;

public class Main {

    private int N;
    private int M;

    public void inputData() {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
    }

    public void printAnswer() {
        if (N == 1 && M == 1) {
            System.out.println(1);
        } else if (N == 1) {
            System.out.println(M - 2);
        } else if (M == 1) {
            System.out.println(N - 2);
        } else {
            System.out.println((N - 2) * (M - 2));
        }
    }

    public void run() {
        inputData();
        printAnswer();
    }

    public static void main(String[] args) {
        (new Main()).run();
    }

}
