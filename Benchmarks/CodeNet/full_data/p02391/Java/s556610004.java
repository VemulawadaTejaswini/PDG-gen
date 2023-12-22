import java.util.Scanner;

/**
 * Created by labuser on 2016/04/18.
 */
public class Main {
    public static void main(String[] args) {
    new Main().run();
    }

    private void run() {

        int a;
        int b;

        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        a = Integer.parseInt(input[0]);
        b = Integer.parseInt(input[1]);

        if (a < b) {
            System.out.println("a < b");
        } else if (a > b) {
            System.out.println("a > b");
        } else if (a == b) {
            System.out.println("a == b");
        }

    }
}