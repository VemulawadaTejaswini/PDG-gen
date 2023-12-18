import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();
        scan.close();

        int timeA = a / d;
        int timeB = c / b;

        String message = timeB >= timeA ? "Yes" : "No";
        System.out.println(message);
    }
}