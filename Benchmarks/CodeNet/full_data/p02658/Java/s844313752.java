import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long a = 1;
        
        for (int i = 0; i < n; i++) {
            a *= sc.nextLong();
            if (a > 1000000000000000000L) {
                a = -1;
                break;
            }
        }
        
        System.out.println(a);
    }
}
