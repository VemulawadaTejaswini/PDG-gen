import java.util.Scanner;

public class Main {

    public static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int n = Integer.parseInt(sc.next());
        String s = sc.next();
        int cnt = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'R') {
                cnt++;
            } else {
                if (cnt == 1) {
                    cnt--;
                }
            }
        }
        System.out.println(cnt);
    }
}