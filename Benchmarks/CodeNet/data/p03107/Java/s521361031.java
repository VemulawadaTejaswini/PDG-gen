import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int ans = 0;
        while(true) {
            String ss = s;
            s = s.replaceAll("01", "");
            if(!ss.equals(s)) {
                ans += ss.length() - s.length();
                continue;
            }
            s = s.replaceAll("10", "");
            if(!ss.equals(s)) {
                ans += ss.length() - s.length();
            } else {
                break;
            }
        }
        System.out.println(ans);
    }
}