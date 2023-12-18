import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        
        long result = A;
        for(long i = A + 1; i < B + 1; i++) {
            result ^= i;
        }
        
        
        System.out.println(result);
    }   
}