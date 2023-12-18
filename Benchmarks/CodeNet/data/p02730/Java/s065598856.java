import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();
        String s1 = s.substring(0, (n - 1) / 2);
        String s2 = s.substring((n + 3) / 2 - 1, n);
        boolean v = s.equals(new StringBuffer(s).reverse().toString())
                && s1.equals(new StringBuffer(s1).reverse().toString())
                && s2.equals(new StringBuffer(s2).reverse().toString());
        System.out.println(v ? "Yes" : "No");
    }
}
