import java.util.*;
import java.lang.*;
 
 //O(100000000)
public class Main {
    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);
        long X = Long.parseLong(sc.next());
        long Y = Long.parseLong(sc.next());
        long Z = Long.parseLong(sc.next());


        System.out.print( (X-Z)/(Y+Z));
        System.out.println();
    }

}

