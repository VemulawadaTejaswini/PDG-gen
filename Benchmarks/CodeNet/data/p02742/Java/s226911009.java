import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        
        long ans = (long) h * w;
        if (ans % 2 == 1) {
            ans++;
        }
        
        System.out.println(ans / 2);
    }
}
