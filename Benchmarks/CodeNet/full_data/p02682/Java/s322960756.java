import java.util.*;

class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long A, B, C, K;
        long sum = 0;
        A = sc.nextLong();
        B = sc.nextLong();
        C = sc.nextLong();
        K = sc.nextLong();

        if (K >= A) {
            for (int i=0;i<A;i++) {
                sum = sum + 1;

              
            }
            K = K - A;
        }
        if (K >= B) {
            for (int i=0;i<B;i++) {

       
            }
            K = K - B;
        }
        if (K >= C) {
            for (int i=0;i<A;i++) {
                sum = sum - 1;

            }
            K = K - C;
        }

        System.out.println(sum);

    }
}