
import java.util.*;


/**
 * Created by Seiya on 2016/10/16.
 */

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] map = new int[100002];

        int n = scanner.nextInt();
        int k = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            map[a] += b;
        }

        long total = 1;
        for (int i = 0; i < 100001; i++) {
            total += map[i];
            if(total > k){
                System.out.println(i);
                break;
            }
        }


    } // mainMethod


} // MainClass
