import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();

        char[] sa = s.toCharArray();
        Arrays.sort(sa);
        char[] ta = t.toCharArray();
        Arrays.sort(ta);
        System.out.println(Arrays.equals(sa, ta) ? "Yes" : "No");
    }
}
