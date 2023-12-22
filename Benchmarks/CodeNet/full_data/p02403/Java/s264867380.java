import java.util.Scanner;

/**
 * Created by malone on 2018/3/15.
 */
public class Main{
    public static void main(String[] args) {
        int a, b,temp1,temp2;
        Scanner scanner = new Scanner(System.in);


        while (((a = scanner.nextInt()) != 0)&&((b = scanner.nextInt()) != 0)) {

            for (int i = 0; i < a; i++) {
                for (int j = 0; j < b; j++) {
                    System.out.printf("#");
                }
                System.out.printf("\n");
            }
        }

    }
}
