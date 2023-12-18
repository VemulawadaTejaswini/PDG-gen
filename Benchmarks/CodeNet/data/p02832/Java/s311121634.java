import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        boolean found = false;
        int ans = 0;
        int target = 1;
        for (int i = 0; i < n; i++) {
            if (a[i] == 1) {
                found = true;
            }
            if (a[i] == target) {
                target++;
            } else {
                ans++;
            }
        }

        if (!found) {
            ans = -1;
        }
        System.out.println(ans);

        sc.close();
    }

}
