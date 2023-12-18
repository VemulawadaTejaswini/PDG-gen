import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        boolean ok = s.equals("AAA") || s.equals("BBB");
        System.out.println(ok ? "No" : "Yes");
    }
}