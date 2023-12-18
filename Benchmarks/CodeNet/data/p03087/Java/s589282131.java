import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        String s = sc.next();

        int[] pos = new int[n];
        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) == 'A' && s.charAt(i + 1) == 'C') {
                pos[i] = 1;
            }
//            System.out.println("pos:" + pos[i]);
        }

        for (int i = 0; i < q; i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            int ans = 0;
//            System.out.println("l-1:" + (l - 1) + ", r-1:" + (r - 1));
            for (int j = l - 1; j < r - 1; j++) {
                ans += pos[j];
            }
            System.out.println(ans);
        }

        sc.close();
    }

}
