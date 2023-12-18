import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int N = sc.nextInt();
        int Q = sc.nextInt();
        String S = sc.next();
        int [] ans = new int [Q];
        int [] ref = new int [N];
        int sum = 0;
        for (int i = 0; i < N-1; i++) {
            if (S.charAt(i) == 'A' && S.charAt(i+1) == 'C') {
                sum++;
                ref[i+1] += sum;
            } else {
                ref[i+1] += sum;
            }
        }
        for (int i = 0; i < Q; i++) {
            int start = sc.nextInt() - 1;
            int fin = sc.nextInt() - 1;
            ans[i] = ref[fin] - ref[start];
        }
        for (int i = 0; i < Q; i++) {
            System.out.println(ans[i]);
        }
    }
}
