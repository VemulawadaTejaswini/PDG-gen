import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String n = sc.next();
        int len = n.length();
        
        int numI = -1;
        for (int i = 1; i < len; i++) {
            if (n.charAt(i) != '9') {
                numI = n.charAt(i-1) - '0';
                break;
            }
        }
        int ans;
        if (numI != -1) {
            ans = 9 * (len - 1) + numI - 1;
        } else {
            ans = 9 * (len - 1) + n.charAt(0) - '0';
        }
        System.out.println(ans);
    }
}