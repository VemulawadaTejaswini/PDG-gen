import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        int x = scan.nextInt();
        scan.close();

        int lower = x - k + 1;
        int upper = x + k - 1;

        for (int i = lower; i <= upper; i++) {
            System.out.print(i);
            if (i != upper) {
                System.out.print(" ");
            }
        }
    }
}
