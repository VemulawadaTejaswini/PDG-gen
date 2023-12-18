import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String[] params = in.nextLine().split(" ");
        int n = Integer.parseInt( params[0] );
        int m = Integer.parseInt( params[1] );

        System.out.println( n == m ? "Yes" : "No" );

    }

}
