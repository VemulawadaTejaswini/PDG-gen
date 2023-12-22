import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();   
        long C = sc.nextLong();   
        long D = sc.nextLong();
        long AC = A*C;
        long AD = A*D;
        long BC = B*C;
        long BD = B*D;
        System.out.println(Math.max(Math.max(AC, AD), Math.max(BC, BD)));
    }
    
}
