import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //コード
        Scanner scanner = new Scanner(System.in);
        Integer a = Integer.parseInt(scanner.next());
        Integer b = Integer.parseInt(scanner.next());
        Integer c = Integer.parseInt(scanner.next());

        Integer total = a + b + c;
        if (total >= 22) {
            System.out.println("bust");
        } else {
            System.out.println("win");
        }
    }
}
