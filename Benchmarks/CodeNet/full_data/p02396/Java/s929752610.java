import static java.lang.System.out;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int counter = 1;
        while (scan.hasNext()) {
            int num = scan.nextInt();
            if (num == 0) {
                break;
            }
            out.printf("Case %d: %d%n", counter, num);
            counter += 1;
        }
    }                                                                  
}