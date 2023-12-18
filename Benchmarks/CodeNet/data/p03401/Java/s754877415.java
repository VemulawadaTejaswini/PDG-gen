import java.util.*;

public class Main {

    private int N;
    private int[] A;

    public void inputData() {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        A = new int[N+2];
        for (int i = 1; i <= N; i++) {
            A[i] = sc.nextInt();
        }
    }

    public void printAnswer() {
        int dist = 0;
        for (int i = 1; i < N+2; i++) {
            dist += Math.abs(A[i] - A[i-1]);
        }
        for (int i = 1; i <= N; i++) {
            System.out.println(dist - (Math.abs(A[i-1] - A[i]) + Math.abs(A[i] - A[i+1])) + Math.abs(A[i-1] - A[i+1]));
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
