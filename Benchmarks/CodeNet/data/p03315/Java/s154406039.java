import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int ans = 0;
        for (int i = 0; i < 4; i++) {
            if (s.charAt(i) == '+') ans++;
            else ans--;
        }
        System.out.println(ans);
    }
}