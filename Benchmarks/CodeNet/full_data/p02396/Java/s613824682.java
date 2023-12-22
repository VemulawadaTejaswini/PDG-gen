
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            int i = 1;
            int num = scan.nextInt();
            System.out.println("Case " + i + ": " + num);
            if (num == 0) {
                break;
            }
        }
    }
}

