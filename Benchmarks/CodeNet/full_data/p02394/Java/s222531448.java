import java.util.Scanner;

/**
 * Created by labuser on 2016/04/19.
 */
public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {

        int W, H, x, y, r;

        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        W = Integer.parseInt(input[0]);
        H = Integer.parseInt(input[1]);
        x = Integer.parseInt(input[2]);
        y = Integer.parseInt(input[3]);
        r = Integer.parseInt(input[4]);

        if (W >= (x + r) && 0 <= (x - r) && H >= (y + r) && 0 <= (y - r)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }


}