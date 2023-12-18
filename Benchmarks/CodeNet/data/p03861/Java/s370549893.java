import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        
        long a = sc.nextLong();
        long b = sc.nextLong();
        long x = sc.nextLong();
        
        long count = 0;
        count += b / x + 1;
        if (a != 0) {
            count -= (a - 1) / x + 1;
//        } else {
  //          count--;
        }
        
        
        System.out.println(count);
    }
}
