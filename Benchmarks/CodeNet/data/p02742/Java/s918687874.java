import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int h = Integer.parseInt(scan.next());
        int w = Integer.parseInt(scan.next());

        scan.close();

        if (h == 1 || w == 1) {
            System.out.println(1);
        } else if (h * w % 2 == 0) {
            System.out.println(h * w / 2);
        } else {
            System.out.println(h * w / 2 + 1);
        }

    }

}