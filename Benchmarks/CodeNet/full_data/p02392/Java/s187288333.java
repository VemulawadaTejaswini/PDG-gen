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
        int c;

        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        a = Integer.parseInt(input[0]);
        b = Integer.parseInt(input[1]);
        c = Integer.parseInt(input[2]);

        if ((a < b) && (b < c)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}