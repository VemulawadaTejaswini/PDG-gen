
import java.util.Scanner;

public class Main {
    char[] cs;
    public static void main(String[] args) {
        Main m = new Main();
        m.read();
        m.solve();
    }

    private void read() {
        Scanner sc = new Scanner(System.in);
        cs = sc.nextLine().toCharArray();
    }

    private void solve() {
        int cnt = 0;
        char[] str = "AKIHABARA".toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < cs.length; i++) {
            char c = cs[i];
            if (c == str[cnt]) {
                cnt++;
                sb.append(c);
            }
            else {
                if (str[cnt] == 'A' && cnt != str.length - 1 &&
                        c == str[cnt+1]) {
                    sb.append('A');
                    sb.append(c);
                    if (i == cs.length - 1)
                        sb.append('A');
                    cnt += 2;
                }
            }
        }
        if (sb.toString().equals("AKIHABARA"))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
