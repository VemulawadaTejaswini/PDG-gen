import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int k = sc.nextInt();
        int[] a = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            a[i] = toI(s.charAt(i));
        }
        for (int i = 0; i < s.length() - 1; i++) {
            int t = a[i];
            int fn = flipNeed(t) ;
            if (fn <= k) {
                k -= fn;
                a[i] = 0; // a
            }
        }
        k %= 26;
        a[s.length() - 1] = ((a[s.length() - 1] + 26) + k) % 26;

        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            ans += toC(a[i]);
        }
        System.out.println(ans);
    }

    static String toC(int n) {
        return ((char) (n + 97)) + "";
    }

    static int toI(char c) {
        return (int) c - 97;
    }

    static int flipNeed(int n) {
        return 26 - n;
    }
}
