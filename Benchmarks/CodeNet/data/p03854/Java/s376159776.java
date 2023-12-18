import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        sc.close();

        S.replaceAll("dream", "-");
        S.replaceAll("dreamer", "-");
        S.replaceAll("erase", "-");
        S.replaceAll("eraser", "-");
        S.replaceAll("-", "");

        System.out.println(S.length() == 0 ? "YES" : "NO");
    }
}