import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int X = scan.nextInt();
        int A = scan.nextInt();
        System.out.println(X < A ? 0 : 10);
    }
}