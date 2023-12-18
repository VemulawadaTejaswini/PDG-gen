import java.lang.reflect.Array;
import java.util.*;
public class Main {




    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in) ;
        int A = Integer.parseInt(scan.next());
        int B = Integer.parseInt(scan.next());

        System.out.println(((A * B) % 2 == 0) ? "No":"Yes");
    }
}