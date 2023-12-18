public class Main {
    private static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt(), q = scanner.nextInt();
        long ans = n;
        String s = scanner.next();
        char[] t = new char[q], d = new char[q];
        for (int i = 0; i < q; i++) {
            t[i] = scanner.next().charAt(0);
            d[i] = scanner.next().charAt(0);
        }

        int a = 0;
        {
            boolean b = false;
            for (int i = q - 1; i >= 0; i--) {
                if (t[i] == s.charAt(a) && d[i] == 'L') {
                    ans--;
                    a++;
                    b = false;
                }
                if (a != 0 && t[i] == s.charAt(a - 1) && d[i] == 'R') {
                    b = true;
                }
            }
            if (b) ans++;
        }


        {
            boolean b = false;
            int a2 = n - 1;
            for (int i = q - 1; i >= 0; i--) {
                if (a > a2)
                    break;

                if (t[i] == s.charAt(a2) && d[i] == 'R') {
                    ans--;
                    a2--;
                    b = false;
                }
                if (a2 != n - 1 && t[i] == s.charAt(a2 + 1) && d[i] == 'L') {
                    b = true;
                }
            }
            if (b) ans++;
        }
        System.out.println(Math.max(ans, 0));
    }
}