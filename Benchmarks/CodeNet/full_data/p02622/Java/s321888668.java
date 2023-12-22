import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        int i = 0, len = s.length(), count = 0;
        while (i < len) {
            if (s.charAt(i) != t.charAt(i)) {
                count++;
            }
            i++;
        }
        System.out.println(count);
    }
}