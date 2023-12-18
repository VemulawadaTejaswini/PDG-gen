import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int canEatDays = scanner.nextInt();
        int beforeExpirationDays = scanner.nextInt();
        int ateAfterBoughtDays = scanner.nextInt();
        int canBeSafeDays = beforeExpirationDays + canEatDays;

        if(ateAfterBoughtDays > canBeSafeDays) {
            System.out.println("dangerous");
        } else {
            if(beforeExpirationDays >= ateAfterBoughtDays) {
                System.out.println("delicious");
            } else {
                System.out.println("safe");
            }
        }
    }
}
