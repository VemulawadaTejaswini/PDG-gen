import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        long k = sc.nextLong();
        int cnt = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                cnt++;
            } else {
                break;
            }
        }
        if (cnt >= k) {
            System.out.println(1);
        } else {
            System.out.println(s.charAt(cnt));
        }
    }
}