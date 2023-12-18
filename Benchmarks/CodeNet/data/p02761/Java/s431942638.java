import java.util.Scanner;

public class Main {
    static int N;
    static int M;
    static int[] s;
    static int[] c;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        s = new int[M];
        c = new int[M];
        for(int i = 0; i < M; i++) {
            s[i] = sc.nextInt();
            c[i] = sc.nextInt();
            --s[i];
        }
        System.out.println(solve());
    }

    static String solve() {
        for(int i = 0; i <= 999; i++) {
            String str = String.valueOf(i);
            if(ok(str)) return str;
        }
        return "-1";
    }

    static boolean ok(String str) {
        if(N != str.length()) return false;
        for(int i = 0; i < M; i++) {
            if(str.charAt(s[i]) != (char)(c[i]+'0')) return false;
        }
        return true;
    }
}
