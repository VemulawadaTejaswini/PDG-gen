import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        char[] A = sc.next().toCharArray();
        char[] B = sc.next().toCharArray();
        char[] C = sc.next().toCharArray();
        int counter = 0;
        for (int i = 0; i < N; i++) {
            if (A[i] == B[i] && B[i] == C[i]) {

            } else if (A[i] != B[i] && B[i] != C[i] && C[i] != A[i]) {
                counter += 2;
            } else counter++;
        }
        System.out.println(counter);
    }
}
