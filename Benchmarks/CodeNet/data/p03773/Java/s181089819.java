import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int result = a + b;
        if (result >= 24) result = a % b;
        
        System.out.println(result);
      
    }
}
