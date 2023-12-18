import java.util.*;

class Main {

    static int gcd(int a, int b) {
        return b > 0 ? gcd(b, a % b) : a;
    }

    static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }

    public static void main(String[] args) {

        long res = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        char[] ch = str.toCharArray();

        long r = 0;
        long g = 0;
        long b = 0;
        for (int i = 0; i < n; i++) {
            if (ch[i] == 'R') {
                r++;
            } else if (ch[i] == 'G') {
                g++;
            } else {
                b++;
            }
        }
        res = r * g * b;

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; 2 * j - i < n; j++) {
                if (ch[i] != ch[j] && ch[j] != ch[j * 2 - i] && ch[j * 2 - i] != ch[i]) {
                    res--;
                }
            }
        }

        System.out.println(res);
        sc.close();
    }
}
