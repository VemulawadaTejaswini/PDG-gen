
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //コード
        Scanner scanner = new Scanner(System.in);
        Integer n = Integer.parseInt(scanner.next());
        Integer m = Integer.parseInt(scanner.next());


        if (n.equals(m)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
