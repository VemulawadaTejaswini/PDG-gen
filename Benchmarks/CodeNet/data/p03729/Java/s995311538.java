import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        String c = sc.next();
        String aa = a.substring(a.length() - 1, a.length());
        String bb = b.substring(0, 1);
        String bbb = b.substring(b.length() - 1, b.length());
        String cc = c.substring(0, 1);
        if(aa.equals(bb) && bbb.equals(cc)) System.out.println("YES");
        else System.out.println("NO");
    }
}
