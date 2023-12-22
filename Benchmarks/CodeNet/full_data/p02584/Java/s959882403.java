import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        long X = scan.nextLong();
        X = Math.abs(X);
        long K = scan.nextLong();
        long D = scan.nextLong();
        
        if(K <= X/D){
            System.out.println(Math.abs(X-D*K));
            return;
        }
        
        K -= X/D;
        X %= D;
        
        if(K%2==0) System.out.println(Math.abs(X));
        else System.out.println(Math.abs(X-D));
    }
}