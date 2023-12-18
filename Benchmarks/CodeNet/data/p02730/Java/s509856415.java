import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        boolean judge = false;
        if (s.substring(0, (s.length() - 1) / 2).equals(s.substring((s.length() + 3) / 2 - 1))) {
            StringBuffer sb = new StringBuffer(s.substring(0, (s.length() - 1) / 2));
            String reversed_s = sb.reverse().toString();
            if (s.substring(0, (s.length() - 1) / 2).equals(reversed_s)) {
                judge = true;
            }
        }
        if (judge) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        sc.close();
    }
}