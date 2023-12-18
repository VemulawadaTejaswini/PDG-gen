import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //コード
        Scanner scanner = new Scanner(System.in);
        int h = Integer.parseInt(scanner.next());
        int a = Integer.parseInt(scanner.next());

        int tmp_int = 1;
        for (int i=a; i < h; i+=a) {
            tmp_int++;
        }
        System.out.println(tmp_int);
    }
}