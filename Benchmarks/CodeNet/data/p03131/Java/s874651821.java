import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long K = sc.nextLong();
        long A = sc.nextLong();
        long B = sc.nextLong();

        if(K < A){
            System.out.println(1+K);
        } else if(A+2 > B){
            System.out.println(1+K);
        } else {
            long N = (K+1- A) / 2 * (B-A) + A + ((K+1- A) % 2);
            System.out.println(N);
        }

    }
}
