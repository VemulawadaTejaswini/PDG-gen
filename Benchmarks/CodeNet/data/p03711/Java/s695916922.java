
import java.util.*;


/**
 * Created by Seiya on 2016/10/16.
 */

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = {0,1,2,1,3,1,3,1,1,3,1,3,1};


        int q = scanner.nextInt();
        int w = scanner.nextInt();

        if(a[q] == a[w]){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }



    } // mainMethod


} // MainClass
