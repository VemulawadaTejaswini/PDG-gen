import java.util.*;

public class Main {
    /**
     * AtCoder Beginner Contest 165
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();

        int i = 0;
        while ( i * K <= B) {
            int result = i * K;
            if ( A <= result && result <= B) {
                System.out.println("OK");
                return;
            }
            i++;
        }
        System.out.println("NG");
    }
}
