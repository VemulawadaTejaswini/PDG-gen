import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if("s".equals(s.subSequence(s.length() - 1, s.length()))) {
            System.out.println(s + "es");
        } else {
            System.out.println(s + "s");
        }
    }
}