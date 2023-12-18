import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int ans = 700;
        for(int i = 0; i < 3; i++) {
            if(s.charAt(i) == 'o') {
                ans += 100;
            }
        }
        System.out.println(ans);
    }
}