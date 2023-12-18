import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        boolean blnFound = false;
        for ( int h = 1; h < 3501; h++ ) {
            for ( int n = 1; n < 3501; n++ ) {
                for ( int w = 1; w < 3501; w++ ) {
                    int a = 4 * h * n * w;
                    int b = N * ( n * w + h * w + h * n);
                    if ( a == b ) {
                        blnFound = true;
                        System.out.println(String.format("%s %s %s", h, n, w));
                        break;
                    }
                }
                if ( blnFound ) break;
            }
            if ( blnFound ) break;
        }
    }
}