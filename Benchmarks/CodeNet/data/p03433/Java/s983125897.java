import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int rest = n % 500;
        if (rest > a) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
}