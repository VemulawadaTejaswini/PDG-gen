import java.util.Scanner;

/**
 * Created by labuser on 2016/04/20.
 */
public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {

        int r;
        double x=Math.PI;
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        r = Integer.parseInt(input[0]);
        System.out.printf("%.6f %.6f\n", x * r * r, x * 2 * r);
    }
}