import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong(), b = sc.nextLong(), c = sc.nextLong();
        
        double test = 2 * Math.sqrt(a+b);
        boolean result = a+b+test < c;
        if(result){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
