
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int time = scanner.nextInt();

        int min_n=-1;
        int min_t=time;
        for( int i=0; i< count; i++ ) {
            int n = scanner.nextInt();
            int t = scanner.nextInt();
            if( t < min_t ) {
                min_n = n;
                min_t = t;
            }
        }
        if( min_n == -1 ) {
            System.out.println("TLE");
        } else {
            System.out.println(min_n);
        }
    }
}
