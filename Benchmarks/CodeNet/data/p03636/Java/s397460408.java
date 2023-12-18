import java.util.Scanner;

public class Main {
    void run() {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        System.out.println((str.charAt(0)) + String.valueOf(str.length() - 2) + str.charAt(str.length()-1));
    }
    public static void main(String[] args) {
        new Main().run();
    }
}