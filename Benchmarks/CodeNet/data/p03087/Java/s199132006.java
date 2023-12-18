import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int N = sc.nextInt();
        int Q = sc.nextInt();
        String S = sc.next();
        int[] ans = new int[Q];
        for (int i = 0; i < Q; i++) {
            int start = sc.nextInt() - 1;
            int fin = sc.nextInt() - 1;
            for (int j = start; j < fin; j++) {
                if (S.charAt(j) == 'A' && S.charAt(j+1) == 'C') {
                    ans[i]++;
                }
            }
        }
        for (int i = 0; i < Q; i++) {
            System.out.println(ans[i]);
        }
    }
}
