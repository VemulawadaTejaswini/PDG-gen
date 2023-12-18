import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        int odd = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            if (a[i] % 2 != 0) {
                odd++;
            }
        }
        // odd の時1通り
        int even = n - odd;
        // evenの時2通り
        long ans = (long) Math.pow(3, n);
        long dame = (long) Math.pow(2, even);
        ans -= dame;
        System.out.println(ans);

        sc.close();
    }
}
