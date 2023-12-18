import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int d = sc.nextInt();
        int n = 25 - d;

        System.out.print("Christmas");
        for (int i = n; i > 0; i--) {
            System.out.print(" Eve");
        }
    }
}
