import java.util.Scanner;

/**
 * Created by malone on 2018/3/9.
 */
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y;

        while (((x = sc.nextInt()) != 0 )&& ((y = sc.nextInt()) != 0)) {
            int temp;
            if (x > y) {
                temp = x;
                x = y;
                y = temp;
            }
            System.out.printf("%d %d\n", x, y);
        }
    }
}

