import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong(), b = sc.nextLong();
        
        long result = a*b/2;
        if(a*b%2!=0) result++;
        
        System.out.println(result);
    }
}
