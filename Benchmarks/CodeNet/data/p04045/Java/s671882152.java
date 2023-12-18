import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] ds = new int[K];
        for (int i = 0; i < K; i++) {
            ds[i] = sc.nextInt();
        }
        System.out.println( solve(N, ds) );
    }

    private static int solve(int N, int[] ds) {
        Set<Integer> hateDigits = new HashSet<>();
        for (int d : ds) {
            hateDigits.add(d);
        }

        int n = N;
        while(true) {
            // 答えがせいぜい6桁, isOkが10回ほどなので
            // O(六桁 * isOk) = O(10^6)で時間内に収まるはず
            if( isOk(n, hateDigits) ) {
                return n;
            } else {
                n++;
            }
        }
    }

    private static boolean isOk(int n, Set<Integer> hateDigits) {
        String s = String.valueOf(n);
        for (int i = 0; i < s.length(); i++) {
            if( hateDigits.contains( s.charAt(i) - '0' ) ) {
                return false;
            }
        }
        return true;
    }
}
