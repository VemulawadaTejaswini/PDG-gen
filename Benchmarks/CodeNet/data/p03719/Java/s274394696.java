
import java.util.*;


/**
 * Created by Seiya on 2016/10/16.
 */

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if(a <= c){
            if(b >= c){
                System.out.println("Yes");
                return;
            }
        }

        System.out.println("No");


    } // mainMethod


} // MainClass
