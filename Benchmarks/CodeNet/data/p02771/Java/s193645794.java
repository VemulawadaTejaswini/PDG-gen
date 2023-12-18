import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();

        if (a == b && b == c && a == c) {
            System.out.println("No");
            return;
        }
        else if (a != b && b != c && a != c) {
            System.out.println("No");
            return;
        } 
        System.out.println("Yes");
    }
}