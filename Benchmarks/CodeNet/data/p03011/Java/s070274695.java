import java.util.Scanner;

public class Main {

    public static void main( String[] args ){

        Scanner in = new Scanner(System.in);

        String[] firstParams = in.nextLine().split(" ");
        int p = Integer.parseInt(firstParams[0]);
        int q = Integer.parseInt(firstParams[1]);
        int r = Integer.parseInt(firstParams[2]);

        int max = p;
        if( p < q )max = q;
        if( q < r )max = r;

        System.out.println(p + q + r - max );

    }
}