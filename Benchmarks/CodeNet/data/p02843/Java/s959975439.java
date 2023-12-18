import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int tmp = n % 100;
        int tmp2 = n / 100;
        int tmp3 = tmp2 * 5;
        
        if (tmp <= tmp3) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
