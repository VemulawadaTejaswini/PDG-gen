import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int N = stdIn.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = stdIn.nextInt();
        }
        stdIn.close();

        String result = "YES";
        out_of_loop:
        for (int i = 0; i < N-1; i++) {
            for (int j = i+1; j < N; j++) {
                if (A[i] == A[j]) {
                    result = "NO";
                    break out_of_loop;
                }
            }
        }
        System.out.println(result);
    }
}