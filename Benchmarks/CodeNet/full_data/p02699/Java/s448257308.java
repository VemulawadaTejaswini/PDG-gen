import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        //コード
        Scanner scanner = new Scanner(System.in);
        Integer s = Integer.parseInt(scanner.next());
        Integer w = Integer.parseInt(scanner.next());

        if(w >= s) {
            System.out.println("unsafe");
        } else {
            System.out.println("safe");
        }
    }
}
