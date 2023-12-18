import java.util.*;

public class Main {
    public static void main(String[] args ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        long K = sc.nextLong();
      
        if(K <= A) {
            System.out.println(K);
        } else if(K < A+B) {
            System.out.println(A);
        } else {
            System.out.println(A-(K-A-B));
        }

    }
}
