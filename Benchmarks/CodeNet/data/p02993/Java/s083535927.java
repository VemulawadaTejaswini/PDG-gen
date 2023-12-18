import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String passStr = sc.next();
        int a = Character.getNumericValue(passStr.charAt(0));
        int b = Character.getNumericValue(passStr.charAt(1));
        int c = Character.getNumericValue(passStr.charAt(2));
        int d = Character.getNumericValue(passStr.charAt(3));
        if (a == b || b == c || c == d) {
            System.out.println("Bad");
        } else {
            System.out.println("Good");
        }
    }
}