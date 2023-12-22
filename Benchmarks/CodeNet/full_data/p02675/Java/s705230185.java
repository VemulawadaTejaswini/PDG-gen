
import java.util.Scanner;

public class TripleDots {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        filter( scanner.nextInt(), scanner.next() );

    }

    public static void filter(int k, String s) {

        if(s.length() <= k) {
            System.out.println(s);
        }else {
            System.out.println(s.substring(0,k) + "...");
        }

    }
}
