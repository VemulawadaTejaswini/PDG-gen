import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//20

        int[] foo = new int[n];
        for (int i = 0; i < n; i++) {
            foo[i] = sc.nextInt();
        }

        Arrays.sort(foo);

        int alice = 0;
        int bob = 0;
        for (int i = 0; i < foo.length; i++) {
            if (i % 2 == 0) {
                alice += foo[i];
            } else {
                bob += foo[i];
            }
        }


        System.out.println(alice - bob);
    }
}
