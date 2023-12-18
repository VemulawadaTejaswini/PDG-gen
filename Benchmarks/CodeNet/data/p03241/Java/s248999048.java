import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long m = sc.nextLong();
        
        int rel = 1;

        for (int i = 2; i <= m/n; i++) {
            if (m%i == 0) {
                rel = i;
            }
        }
        System.out.println(rel);

        sc.close();
    }
}
