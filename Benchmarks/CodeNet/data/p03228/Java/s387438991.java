import java.util.*;

public class Main {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int K = sc.nextInt();
        sc.close();
        int give=0;
        for (int i = 0; i < K; i ++) {
            if (i%2 == 0) {
            if(A%2 == 1)A--;
            give = A/2;
            B += give;
            A -= give;
            }else {
            if(B%2 == 1)B--;
            give = B/2;
            A += give;
            B -= give;
            }
        }
        System.out.println(A + " " + B);
    }
}