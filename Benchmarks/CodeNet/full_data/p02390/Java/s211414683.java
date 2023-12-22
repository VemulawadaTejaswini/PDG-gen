import java.util.Scanner;

/**
 * Created by labuser on 2016/04/15.
 */
public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        int s;
        int h;
        int m;
        int sl;

        Scanner sc = new Scanner(System.in);
        s = Integer.parseInt(sc.nextLine());

        h = s / 3600;
        m = s % 3600 / 60;
        sl = s % 3600 % 60;
        System.out.println(h+":"+m+":"+sl);

    }
}