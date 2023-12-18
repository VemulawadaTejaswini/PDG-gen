import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = sc.nextInt();
        int max = -1;
        for (int i = 1; i < sum; i++) {
            if (sum % i == 0 && sum / i >= n) {
                max = i;
            } else if (sum / i < n) {
                break;
            }
        }
        
        System.out.println(max);
    }
}
