
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @author yoshizaki
 *
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int value = scanner.nextInt();
        int count = scanner.nextInt();
        scanner.nextLine();
        String anti = scanner.nextLine();
        int valn = 0;
        int ans = 0;
        aaa: for (int i = value ; i < 10000 ; i ++) {
            char[] val = anti.replaceAll(" ", "").toCharArray(); 
            String va = String.valueOf(i);
            for (char v : val) {
                if(-1 < va.indexOf(v)) {
                    continue aaa;
                }
            }
            ans = i;
        }
        System.out.println(ans);
    }
}
