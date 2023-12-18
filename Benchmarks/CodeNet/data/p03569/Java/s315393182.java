import java.util.Scanner;

public class Main {
    static Scanner in;

    void solve() {
        String s = in.nextLine();
        StringBuilder sb = new StringBuilder();
        sb.append(s.replace("x", ""));
        String s2 = sb.toString();
        if (s.equals(s2)) {
            System.out.println(0);
            return;
        }
        if (!s.replace("x", "").equals(s2)) {
            System.out.println(-1);
            return;
        }
        int left = 0, right = s.length() - 1, ans = 0;
        while(left < right) {
            if(s.charAt(left) == s.charAt(right)) {
                left++;
                right--;
            }else{
                ans++;
                if(s.charAt(left) == 'x') {
                    left++;
                }else {
                    right--;
                }
            }
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        in = new Scanner(System.in);
        new Main().solve();
    }
}
