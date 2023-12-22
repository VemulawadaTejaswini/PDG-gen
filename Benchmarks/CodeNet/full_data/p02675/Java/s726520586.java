import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String N = scanner.nextLine();
        char lastDigit = N.charAt(N.length()-1);
        if (lastDigit == '3') {
            System.out.println("bon");
        } else if (lastDigit == '0' || lastDigit == '1' || lastDigit == '6' || lastDigit == '8') {
            System.out.println("pon");
        } else {
            System.out.println("hon");
        }
    }
}