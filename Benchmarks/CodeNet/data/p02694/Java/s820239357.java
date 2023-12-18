import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        long X = scanner.nextLong();
        long A = 100;
        int Y = 0;
        
        while(A<X){
            A *= 1.01;
            Y++;
        }
        
        System.out.println(Y);
        
    }
}
