import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int [] A = new int [N];
        for (int i = 0 ; i < N ; i++) {
            A[i] = sc.nextInt();
        }
        Arrays.sort(A);

        int a = 0 ;
        int b = 0;
        if (N % 2 == 1) {
            for (int i = 0 ; i < N ; i++) {
                if (i % 2 == 0) {
                    b += A[i];
                } else {
                    a += A[i];
                }
            }
        } else {
            for (int i = 0 ; i < N ; i++) {
                if (i % 2 == 0) {
                    a += A[i];
                } else {
                    b += A[i];
                }
            }
        }
        System.out.println(b - a);
    }

}