import java.util.Scanner;

/**
 * Created by labuser on 2016/04/19.
 */
public class Main {
    public static void main(String[] args) {
        new Main().run();
    }


    private void run() {

        int i = 1;

        Scanner sc = new Scanner(System.in);

        while (true) {
            int a = sc.nextInt();
            if (a == 0) break;
        else {
                System.out.println("Case" + " " + i + ":" + " " + a);
                i = i + 1;
            }


        }
    }
}