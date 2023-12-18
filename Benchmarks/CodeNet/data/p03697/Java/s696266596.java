
import java.util.*;


/**
 * Created by Seiya on 2016/10/16.
 */

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ans  = 0;

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        ans = a + b;

        if(ans < 10) {
            System.out.println(ans);
        }else{
            System.out.println("error");
        }
    } // mainMethod


} // MainClass
