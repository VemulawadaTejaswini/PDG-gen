import java.util.Scanner;

/**
 * Created by labuser on 2016/04/20.
 */
public class Main {
    public static void main(String[] args) {
        new Main().run();

    }

    private void run() {

        int a, b;
        double f;
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        a = Integer.parseInt(input[0]);
        b = Integer.parseInt(input[1]);
        f = 1.0 * a / b;
        System.out.printf("%d %d %.5f\n",a/b,a%b,f);


    }


}