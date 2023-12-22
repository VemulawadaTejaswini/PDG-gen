import java.util.Scanner;

/**
 * Created by ui on 2016/02/23.
 */
public class XCubic {
    static void run () {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(x * x * x);
    }
}
public class Main {
    public static void main(String[] args) {
        XCubic.run();
    }

}