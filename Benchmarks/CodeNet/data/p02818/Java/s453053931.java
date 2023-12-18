import java.util.*;
 
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        long K = sc.nextLong();

        long diffA = Math.min(A, K);
        A -= diffA;
        K -= diffA;
        B -= Math.min(B, K);

        System.out.println(A+" "+B);
    }
}
