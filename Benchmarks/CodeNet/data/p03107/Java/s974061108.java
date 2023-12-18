import java.util.*;

public class Main {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int reds = 0;
        int idx = 0;

        while (idx < s.length()) {
            if (s.charAt(idx++) == '0') reds++;
        }
        System.out.println(Math.min(reds, s.length()-reds) * 2);
    }
}