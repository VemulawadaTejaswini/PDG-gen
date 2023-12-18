import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        sc.close();

        if (n > 3) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}