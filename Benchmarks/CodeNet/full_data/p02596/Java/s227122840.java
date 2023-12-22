import java.util.*;

public class Main{

    final static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println(C());
    }

    public static int C(){
        int K = sc.nextInt();
        if (K % 2 != 0) {
            int x = K % 7;
            for (var i = 1; i <= K; i++) {
                if (x == 0) {
                    return i;
                } else {
                    x = (x * 10 + 7) % K;
                }
            }
        }
        return -1;
    }
}

