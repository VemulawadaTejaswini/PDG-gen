import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            c[i] = sc.nextInt();
        }
        Arrays.sort(a);
        Arrays.sort(c);
        int countA = 0;
        int countB = 0;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (a[j] < b[i])
                    countA++;
                else
                    break;
            }
            for (int j = n - 1; j >= 0; j--) {
                if (c[j] > b[i])
                    countB++;
                else
                    break;
            }
            // System.out.println(countA + ":" + countB);
            ans += countA * countB;
            countA = 0;
            countB = 0;
        }
        System.out.println(ans);
    }
}
