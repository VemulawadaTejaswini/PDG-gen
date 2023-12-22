import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int K = sc.nextInt();

        int total = 0;
        for (int i = 0; i < K; i++) {
            if (0 < A) {
                total++;
                A--;
            } else if (0 < B) {
                B--;
            } else {
                total--;
            }
        }
        System.out.println(total);
    }
}