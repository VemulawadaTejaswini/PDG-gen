import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        if (a > b) {
            System.out.println(0);
            return;
        }
        
        if (n == 1 && a != b) {
            System.out.println(0);
            return;
        }
        
        n--;
        n--;
        
        long min = (long)a * n;
        long max = (long)b * n;
        
        System.out.println(max - min + 1);
    }
}
