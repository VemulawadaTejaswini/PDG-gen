import java.util.Scanner;
import java.util.HashMap;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            if (i >= n / 2) {
                int tmp = a[i];
                b[i] = tmp;
            }
        }
        for (int i = n/2-1; i >= 0; i--) {
            int sum = 0;
            for (int j = 2; j <= n/(i+1); j++) {
                sum += b[(i+1)*j-1];
            }
            if (a[i] == 0) {
                if (sum % 2 == 0) {
                    b[i] = 0;
                } else {
                    b[i] = 1;
                }
            } else {
                if (sum % 2 == 0) {
                    b[i] = 1;
                } else {
                    b[i] = 0;
                }
            }
        }
        if (b[0] != a[0]) {
            System.out.println(-1);
        } else {
            int ans = 0;
            ArrayList<Integer> ansans = new ArrayList<Integer>();
            for (int i = 0; i < n; i++) {
                if (b[i] == 1) {
                    ans++;
                    ansans.add(i+1);
                }
            }
            System.out.println(ans);
            for (int i = 0; i < ansans.size(); i++) {
                if (i == ansans.size()-1) {
                    System.out.println(ansans.get(i));
                } else {
                    System.out.print(ansans.get(i) + " ");
                }
            }
        }
    }

}
