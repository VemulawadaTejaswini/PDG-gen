import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        int[] res = new int[n];
        Arrays.setAll(A, i -> Integer.parseInt(sc.next()));
        int idx1 = n / 2 + (n % 2 == 0 ? -1 : 0);
        int idx2 = n / 2 + (n % 2 == 0 ? 0 : 1);
        for(int i = 0; i < n; i++) {
            if(n % 2 == 0) {
                if(i % 2 == 0) res[idx2++] = A[i];
                else res[idx1--] = A[i];
            } else {
                if(i % 2 == 0) res[idx1--] = A[i];
                else res[idx2++] = A[i];
            }
        }
        for(int i = 0; i < n; i++) sb.append(res[i] + (i < n-1 ? " " : "\n"));
        System.out.print(sb);
    }
}
