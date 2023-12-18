import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong(), b = sc.nextLong(), c = sc.nextLong();
        
        double left = Math.sqrt(a)+Math.sqrt(b);
        double right = Math.sqrt(c);
        boolean result = left < right;
        if(result){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
    }
}
