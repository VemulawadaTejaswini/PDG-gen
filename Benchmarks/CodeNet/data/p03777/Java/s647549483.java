import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char a = scan.next().charAt(0);
        char b = scan.next().charAt(0);

        if (a == b) {
            System.out.println("H");
        } else {
            System.out.println("D");
        }
    }
}