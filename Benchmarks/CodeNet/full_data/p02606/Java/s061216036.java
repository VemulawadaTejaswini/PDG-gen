import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        int count = 0;
        for (int i = a; i <= b; i++) {
            if (i % c == 0) count++;
        }
        System.out.println(count);
    }
}
