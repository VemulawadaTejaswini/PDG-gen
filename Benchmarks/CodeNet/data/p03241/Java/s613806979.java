import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long m = sc.nextLong();
        
        for (long i = m/n; i >= 2 ; i--) {
            if (m%i == 0) {
                System.out.println(i);
                break;
            }
        }

        sc.close();
    }
}
