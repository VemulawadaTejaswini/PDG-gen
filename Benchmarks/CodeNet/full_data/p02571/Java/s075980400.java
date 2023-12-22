import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        int count = s.length() - t.length();
        if(s.contains(t)) {
            System.out.println("Yes");
            return;
        }
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < count; i++) {
            int tmp = 0;
            for (int j = 0; j < t.length(); j++) {
                if(s.charAt(i + j) != t.charAt(j)) {
                    tmp++;
                }
            }
            ans = Math.min(ans, tmp);
        }
        System.out.println(ans);
    }
}