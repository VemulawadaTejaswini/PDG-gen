
import java.util.*;

public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int a = k / 2;
        int b = k / 2 + ((k % 2 == 1) ? 1 : 0);

        System.out.println(a * b);
    }

}
