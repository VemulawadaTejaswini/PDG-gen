import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        String result = "ABD";
        if (n < 1000) result = "ABC";
      
        System.out.println(result);
    }
}
