import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int max = 1;
        int cnt = 1;
        for (int i = 1 ; i < 4 ; i++) {
            if (s.charAt(i) == s.charAt(i-1)) cnt++;
            else cnt = 1;
            max = Math.max(max, cnt);
        }
        System.out.println(max >= 3 ? "Yes" : "No");
    }
}