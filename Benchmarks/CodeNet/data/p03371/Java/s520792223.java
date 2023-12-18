import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        
        long A = scanner.nextLong();
        long B = scanner.nextLong();
        long C = scanner.nextLong();
        long X = scanner.nextLong();
        long Y = scanner.nextLong();
        long price = 0;
        
        if(X<=Y){
            price = 2*C*X + B*((Y-X+1)/2);
        }else{
            price = 2*C*Y + A*((X-Y+1)/2);
        }
        
        if(A*X+B*Y>=price){
            System.out.println(price);
        }else{
            System.out.println(A*X+B*Y);
        }
        
    }
}
