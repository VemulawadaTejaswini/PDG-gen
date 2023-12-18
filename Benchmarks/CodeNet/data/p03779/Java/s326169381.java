
import java.util.*;


/**
 * Created by Seiya on 2016/10/16.
 */

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long N = scanner.nextLong();

        int i = 1;
        long sum = 0;
        while(N > sum){
            sum += i;
            i++;
        }
        System.out.println(i - 1);


    } // mainMethod


} // MainClass
