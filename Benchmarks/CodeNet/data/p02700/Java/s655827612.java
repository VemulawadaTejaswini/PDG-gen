import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int aHP = scanner.nextInt();
        int aPower = scanner.nextInt();
        int bHP = scanner.nextInt();
        int bPower = scanner.nextInt();
        if (aHP / bPower <= bHP / aPower) {
           	 System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}