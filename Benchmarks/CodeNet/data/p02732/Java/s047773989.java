import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n + 1];
        int[] Aa = new int[n + 1];
        long result = 0;
        for(int i = 0; i < n; i++) {
            Aa[i] = Integer.parseInt(sc.next());
            A[Aa[i]]++;
        }
        for(int i = 0; i < n; i++) {
            result += nC2(A[i + 1]);
        }
        for(int i = 0; i < n; i++) {
            long ans = result - nC2(A[Aa[i]]) + nC2(A[Aa[i]] > 0 ? A[Aa[i]] - 1 : 0);
            System.out.println(ans);
        }
    }

    static long nC2(int n) {
        return n * (n - 1) / 2;
    }
}
