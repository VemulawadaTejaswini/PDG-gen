import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        boolean blnFound = false;
        for ( int h = 1; h < 3501; h++ ) {
            for ( int n = 1; n < 3501; n++ ) {
                for ( int w = 1; w < 3501; w++ ) {
                    int p = h * n * w;
                    int p4 = 4 * p;
                    int r = p4 % N;
                    if ( r != 0 ) continue;
                    int q = p4 / N;
                    int s = h + n + w;
                    int P = (h+1)*(n+1)*(w+1);
                    if ( p + s + q + 1 == P ) {
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