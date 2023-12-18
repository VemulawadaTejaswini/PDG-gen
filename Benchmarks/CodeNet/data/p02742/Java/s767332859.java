import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long h = scan.nextInt();
        long w = scan.nextInt();


        if (w % 2 == 0) {
            System.out.println((w / 2) * h);
        } else {
            if (h % 2 == 0) {
                System.out.println(w * (h / 2));
            } else {
                System.out.println(w * (h / 2) + (w / 2 + 1));
            }
        }
    }
}
