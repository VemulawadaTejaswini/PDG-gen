import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        long X = scan.nextLong();
        X = Math.abs(X);
        long K = scan.nextLong();
        long D = scan.nextLong();
        K -= X/D;
        X %= D;
        if(K%2==0) System.out.println(Math.abs(X+D));
        else System.out.println(Math.abs(X));
    }
}
