
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();


        c -= a -b;
        if (c <= 0) {
            System.out.println(0);
        } else {
            System.out.println(c);
        }

    }

}
