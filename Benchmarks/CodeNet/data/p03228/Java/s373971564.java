import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int K = sc.nextInt();

        for (int i = 0; i < K; i++) {
            if (A % 2 == 1) {
                A -= 1;
            }
            A /= 2;
            B += A;

            i++;
            if (i >= K) {
                break;
            }

            if (B % 2 == 1) {
                B -= 1;
            }
            B /= 2;
            A += B;
        }

        System.out.println(A + " " + B);
    }
}