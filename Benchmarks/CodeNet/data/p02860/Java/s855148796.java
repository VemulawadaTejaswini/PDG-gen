import java.util.Scanner;

/**
 * <p>ClassName:  </p>
 * <p>Description: </p>
 * <p>Company: </p>
 *
 * @author zhangyong
 * @version 1.0.0
 * @date 2019/10/22 7:40
 */
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String str = in.next();
        if (n % 2 != 0) {
            System.out.println("No");
            return;
        }
        if (str.substring(0, str.length() / 2 - 1).equals(str.substring(str.length() / 2, str.length() - 1))) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
