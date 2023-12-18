import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] s = sc.next().toCharArray();
        for (int i = 0; i < s.length; i++) {
            int x = s[i] + n;
            if('Z' < x) x -= 26;
            s[i] = (char)(x);
        }
        System.out.println(String.valueOf(s));
        sc.close();

    }

}
