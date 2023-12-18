import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long A = sc.nextLong();
        long B = sc.nextLong();
        long C = sc.nextLong();
        long D = sc.nextLong();
        long E = sc.nextLong();
        long neck = Math.min(Math.min(Math.min(D, E),Math.min(C, D)), Math.min(A, B));
        System.out.println((N+(neck-1))/neck+4);
    }
    
}