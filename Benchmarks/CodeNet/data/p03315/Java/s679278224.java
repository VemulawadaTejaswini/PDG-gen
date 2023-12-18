import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();

        int ans = 0;
        for (int i = 0; i < 4; i++) {
            if (s.charAt(i) == '+') {
                ans++;
            } else {
                ans--;
            }
        }
        
        System.out.println(ans);
    }
}