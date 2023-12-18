import java.util.Scanner;

public class Main {
    public static void main(String[] c) {
        Scanner scan = new Scanner(System.in);
        int ftMonth = scan.nextInt();
        int ftDay = scan.nextInt();
        int scMonth = scan.nextInt();
        int scDay = scan.nextInt();

        if (ftMonth != scMonth) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
