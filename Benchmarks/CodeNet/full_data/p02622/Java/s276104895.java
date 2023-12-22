import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        int count = 0;
        for (int i = 0; i < str1.length(); i++) {
            count += str1.charAt(i) != str2.charAt(i) ? 1 : 0;
        }
        System.out.println(count);
    }
}