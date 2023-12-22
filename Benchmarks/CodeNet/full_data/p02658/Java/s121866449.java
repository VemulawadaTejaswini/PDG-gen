import java.util.*;

public class Main{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();

        int ans = 1;
        for(int loop=0; loop<N; loop++) {
            int A = scanner.nextInt();
            ans *= A;
        }

        System.out.println( ans );
    }
}