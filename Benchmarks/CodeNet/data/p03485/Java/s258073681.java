import static java.lang.Math.*;
import java.util.Scanner;
public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int x = (int)ceil((a*1.0 +b*1.0)/2.0);
            System.out.println(x);
        }
}