import java.util.*;

public class test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num[] = new int[10];
        char s[] = scan.next().toCharArray();
        for (int i = 0; i < 4; i++) num[Integer.parseInt(s[0] + "")]++;
        boolean ok = false;
        for (int i = 0; i < 10; i++) if (num[i] >= 3) ok = true;
        if (ok) System.out.println("YES");
        else System.out.println("NO");
    }
}
