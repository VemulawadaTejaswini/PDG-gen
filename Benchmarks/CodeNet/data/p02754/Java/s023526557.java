import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        int r = sc.nextInt();

        String balls = "";
        while (balls.length() < n) {
            for (int i = 0; i < b; i++) {
                balls += 'b';
            }
            for (int i = 0; i < r; i++) {
                balls += 'r';
            }
        }
        
        char[] balls_array = balls.toCharArray();

        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (balls_array[i] == 'b') {
                ans++;
            }
        }

        System.out.println(ans);
    }
}