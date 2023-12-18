import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long A[] = new long[N];
        long array[] = new long[N];
        long yoko = 0, tate = 0;
        int l = 0;
        long tmp = 0;
        for (int i = 0; N > i; i++) {
            A[i] = sc.nextLong();
        }
        Arrays.sort(A);
        for (int j = N-1; 0 <= j; j--) {
            if (tmp != A[j]) {
                tmp = A[j];
            } else {
                yoko = A[j];
                l = j;
                break;
            }
        }
        tmp = 0;
        for (int k = l - 1; 0 <= k; k--) {
            if (tmp != A[k]) {
                tmp = A[k];
            } else {
                tate = A[k];
                break;
            }
        }
        System.out.println(yoko * tate);
    }
}
