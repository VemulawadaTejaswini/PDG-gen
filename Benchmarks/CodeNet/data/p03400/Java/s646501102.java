import java.util.*;

public class Main {

    private int N;
    private int D;
    private int X;
    private int[] A;

    public void inputData() {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        D = sc.nextInt();
        X = sc.nextInt();
        A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
    }

    public void printAnswer() {
        int count = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 1; j <= D; j += A[i]) {
                count++;
            }
        }
        count += X;
        System.out.println(count);
    }

    public void run() {
        inputData();
        printAnswer();
    }

    public static void main(String[] args) {
        (new Main()).run();
    }

}
