import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        char S[] = sc.next().toCharArray();
        
        int W = 0;
        int E = 0;
        for(int i = 1; i < N; i++ ) {
            if( S[i] == 'E' ) {
                E++;
            }
        }
        
        int min = W + E;
        for( int i = 1; i < N; i++ ) {
            if( S[i-1] == 'W' ) {
                W++;
            }
            if( S[i] == 'E' ) {
                E--;
            }
            min = Math.min( min, W + E );
        }

        System.out.println(min);
    }
}
