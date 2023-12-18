import java.util.*;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int N = stdIn.nextInt();    
        int[] P = new int[N];
        for (int i = 0; i < N; i++) {
            P[i] = stdIn.nextInt();
        }   
        stdIn.close();

        int result = 0;
        for (int i = 1; i <= N; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (P[i - 1] <= P[j - 1]) {
                    count++;
                }
            }
            if (count == i) {
                result ++;
            }
        }
        System.out.println(result);

    }
}