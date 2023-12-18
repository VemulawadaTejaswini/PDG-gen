import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int W = sc.nextInt();
        int H = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        
        System.out.print( (long) W * H / 2 + " " );
        
        boolean isOK = (double)x == (double) W / 2.0 && (double)y == (double) H / 2.0;
        System.out.println( isOK ? 1 : 0 );
    }
}
