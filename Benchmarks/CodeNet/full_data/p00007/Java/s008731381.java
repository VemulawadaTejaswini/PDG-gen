import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int week = scan.nextInt();
            double debt = 100000;
            for (int i = 0; i < week; i++) {
                debt *= 1.05;
                System.out.println(debt);
                if (debt % 1000 > 0) {
                    debt += 1000 - debt % 1000;
                }
                System.out.println(debt);
            }
            System.out.println(debt);
        } catch (Exception e) {
            System.exit(0);
        }
    }

}