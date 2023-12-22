
import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        //コード
        Scanner scanner = new Scanner(System.in);
        Integer k = Integer.parseInt(scanner.next());
        Integer a = Integer.parseInt(scanner.next());
        Integer b = Integer.parseInt(scanner.next());

        if(k == 1) {
            System.out.println("OK");
            System.exit(0);
        }

        int total = k;
        for(;;) {
            if(total >= a && total <= b) {
                System.out.println("OK");
                break;
            }
            if(total >= b) {
                System.out.println("NG");
                break;
            }
            total *= k;
        }
    }
}
