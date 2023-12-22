import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String t = scan.nextLine();
        if (s.equals(t.substring(0, s.length()))) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}