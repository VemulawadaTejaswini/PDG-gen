import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        int diff = Math.abs(a-b)%2;

        if(diff == 0) {
            System.out.println("Alice");
        } else if (diff >= 1) {
            System.out.println("Borys");
        } else {
            System.out.println("Draw");
        }
    }
}
