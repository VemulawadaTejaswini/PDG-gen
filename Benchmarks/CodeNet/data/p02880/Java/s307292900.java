
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 0; i <= 9 ; i++) {

            for (int j = 0; j <= 9 ; j++) {

                set.add(i * j);

            }

        }

        int x = in.nextInt();
        if (set.contains(x)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }

}
