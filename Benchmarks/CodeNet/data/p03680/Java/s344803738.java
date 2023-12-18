import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        int N = sc.nextInt();
        int button [] = new int [N]; 

        for (int i = 0; i < N; i++) {
            button[i] = sc.nextInt();
        } 

        int now = 1;
        int count = 0;

        for (;;) {
            if ( now == 2) {
                System.out.println( count );
                break;
            } else if ( count >= N ) {
                System.out.println( -1 );
                break;
            } else {
                count++;
                now = button[now - 1];
            }
        }
    }
}