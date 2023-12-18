import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] s = sc.next().toCharArray();
        char[] t = sc.next().toCharArray();
        String ans = "";
        for (int i = 0; i < n; i++) {
            ans += s[i];
            ans += t[i];
        }
        System.out.println(ans);
    }
}