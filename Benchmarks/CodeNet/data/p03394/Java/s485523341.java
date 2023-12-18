import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    static  char[][] ret = new char[100][100];
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        for (int i = 0; i < a-1; i++) {
            System.out.print(2*i+3 + " ");
        }
        System.out.println(2);
    }

}
