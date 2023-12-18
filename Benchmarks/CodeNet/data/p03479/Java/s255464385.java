import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long y = sc.nextLong();
        int count = 0;
        while (x <= y) {
            count++;
            x *= 2;
        }
        
        System.out.println(count);
    }
}
