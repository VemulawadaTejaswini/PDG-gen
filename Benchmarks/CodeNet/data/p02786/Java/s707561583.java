import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        
        long count = 0;
        long sum = 0;
        while (true) {
            n /= 2;
            sum += Math.pow(2,count);
            count++;
            if (n == 0) {
                break;
            }
        }
        
        System.out.println(sum);
    }
}
