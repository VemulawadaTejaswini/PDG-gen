import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by labuser on 2016/04/18.
 */
public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {

        int[] a = new int[3];

        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        a[0] = Integer.parseInt(input[0]);
        a[1] = Integer.parseInt(input[1]);
        a[2] = Integer.parseInt(input[2]);

        Arrays.sort(a);
        System.out.println(a[0] + " " + a[1] + " " + a[2]);
        //System.out.printf("%d %d %d\n", a[0], a[1], a[2]);


    }
}