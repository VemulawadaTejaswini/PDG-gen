import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author k16075kk
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        ArrayList<Integer> foo = new ArrayList<>();

        foo.add(a);
        foo.add(b);
        foo.add(c);

        Collections.sort(foo);

        for (int i = 0; i < foo.size(); i++) {

            System.out.print(foo.get(i) + " ");
        }

    }

}

