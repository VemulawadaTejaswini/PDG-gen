public class Main {
    private static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt(), q = scanner.nextInt();
        long ans = 0;
        String s = scanner.next();
        char[] t = new char[q], d = new char[q];
        for (int i = 0; i < q; i++) {
            t[i] = scanner.next().charAt(0);
            d[i] = scanner.next().charAt(0);
        }


        {
            boolean b = false;
            int a = 0;
            for (int i = q - 1; i >= 0; i--) {
                if (t[i] == s.charAt(a) && d[i] == 'L') {
                    ans++;
                    a++;
                    b = false;
                }
                if (a != 0 && t[i] == s.charAt(a - 1) && d[i] == 'R') {
                    b = true;
                }
            }
            if (b) ans--;
        }

        {
            boolean b = false;
            int a = n - 1;
            for (int i = q - 1; i >= 0; i--) {
                if (t[i] == s.charAt(a) && d[i] == 'R') {
                    ans++;
                    a--;
                    b = false;
                }
                if (a != n - 1 && t[i] == s.charAt(a + 1) && d[i] == 'L') {
                    b = true;
                }
            }
            if (b) ans--;
        }
        System.out.println(n - ans);
    }
}