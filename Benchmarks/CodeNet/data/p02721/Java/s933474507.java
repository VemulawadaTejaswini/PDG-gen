paimport java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), k = in.nextInt(), c = in.nextInt(), pre[] = new int[k + 1], suf[] = new int[k + 1];
        String s = in.next();
        for (int i = 1; i <= k; i++) {
            int j = 0;
            if (i != 1)
                j = pre[i - 1] + c;
            for (; j < n; j++) {
                if (s.charAt(j) == 'o') {
                    pre[i] = j + 1;
                    break;
                }
            }
        }
        for (int i = k; i > 0; i--) {
            int j = n - 1;
            if (i != k)
                j = suf[i + 1] - 1 - c - 1;
            for (; j >= 0; j--) {
                if (s.charAt(j) == 'o') {
                    suf[i] = j + 1;
                    break;
                }
            }
        }
        for (int i = 1; i <= k; i++) {
            if (pre[i] == suf[i] && pre[i] != 0)
                System.out.println(pre[i]);
        }
    }

}
