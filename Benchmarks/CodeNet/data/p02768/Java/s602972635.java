import java.util.*;
public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        
        int prev = n;
        int cur = 0;
        long sum = n;
        for(int i = 2; i<= n; i++) {
            cur = prev * (n - i + 1) / i;
            if(i != a && i != b)
                sum += cur;
            prev = cur;
        }

        System.out.println(sum % (Math.pow(10,9) + 7));
    }
}