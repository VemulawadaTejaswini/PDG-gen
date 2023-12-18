import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int aHP = scanner.nextInt();
        int aPower = scanner.nextInt();
        int bHP = scanner.nextInt();
        int bPower = scanner.nextInt();
        bHP -= aPower;
        while(bHP > 1) {
            aHP -= bPower;
            if (aHP < 1) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}