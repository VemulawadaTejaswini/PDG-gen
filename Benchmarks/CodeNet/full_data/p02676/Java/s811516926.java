import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        String s = sc.next();
        int l = s.length();
        if (k >= l) {
            System.out.println(s);
        } else {
            System.out.println(s.substring(0, k) + "...");
        }
    }
}