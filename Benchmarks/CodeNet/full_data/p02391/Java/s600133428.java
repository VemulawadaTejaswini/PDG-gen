import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        char ch;
        if (x < y) System.out.println("a" + " < " + "b");
        else if (x > y) System.out.println("a" + " > " + "b");
        else System.out.println("a" + " == " + "b");
    }
}