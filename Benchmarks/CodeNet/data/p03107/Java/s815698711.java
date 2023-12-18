import java.util.Scanner;

class Main {
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        int ans = 0;
        while(true) {
            int idx_01 = s.indexOf("01");
            int idx_10 = s.indexOf("10");
            if (idx_01 != -1) {
                s = s.substring(0, idx_01) + s.substring(idx_01 + 2, s.length());
                ans += 2;
                continue;
            }
            if (idx_10 != -1) {
                s = s.substring(0, idx_10) + s.substring(idx_10 + 2, s.length());
                ans += 2;
                continue;
            }
            break;
        }
        System.out.println(ans);
    }
}