import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int canEatDays = scanner.nextInt();
        int beforeExpirationDays = scanner.nextInt();
        int ateAfterBoughtDays = scanner.nextInt();
        int canBeSafeDays = beforeExpirationDays + canEatDays +1;

        if(ateAfterBoughtDays >= canBeSafeDays) {
            System.out.println("Dangerous");
        } else {
            if(beforeExpirationDays >= ateAfterBoughtDays) {
                System.out.println("Delicious");
            } else {
                System.out.println("Safe");
            }
        }
    }
}
