
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        if (str.charAt(2) == str.charAt(3) && str.charAt(4) == str.charAt(5)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}