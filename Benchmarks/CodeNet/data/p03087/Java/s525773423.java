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

        int[] num = new int[n];
        num[0] = pos[0];
        for (int i = 1; i < n - 1; i++) {
            num[i] = num[i - 1] + pos[i];
//            System.out.println(num[i]);
        }
//        System.out.println();

        for (int i = 0; i < q; i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            int max;
            if (r - 1 - 1 < 0) {
                max = 0;
            } else {
                max = num[r - 1 - 1];
            }
            int min;
            if (l - 1 - 1 < 0) {
                min = 0;
            } else {
                min = num[l - 1 - 1];
            }
            int ans = max - min;
            System.out.println(ans);
        }

        sc.close();
    }

}
