import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            String s = sc.next();
            if (s.equals("#")) {
                break;
            }
            
            int ans = solve(s);
            System.out.println(ans);
        }
    }
    
    public static int solve(String s) {
        int ans = 0;
        for (int i = 1; i < s.length(); i++) {
            boolean a = isLeftHand(s.charAt(i));
            boolean b = isLeftHand(s.charAt(i - 1));
            if (a && !b || !a && b) {
                ans++;
            }
        }
        
        return ans;
    }
    
    public static boolean isLeftHand(char c) {
        char[] cArray = {'a', 'b', 'c', 'd', 'e', 'f', 'g',
                         'q', 'r', 's', 't', 'v', 'w', 'x', 'z'};
        int tmp = Arrays.binarySearch(cArray, c);
        if (tmp >= 0) {
            return true;
        } else {
            return false;
        }
    }
}