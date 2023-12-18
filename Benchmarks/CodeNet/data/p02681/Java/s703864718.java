import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next(), t = sc.next();
        System.out.println(t.substring(0, t.length() - 1).equals(s) ? "Yes" : "No");
    }
}
