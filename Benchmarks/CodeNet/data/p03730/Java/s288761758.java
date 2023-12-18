import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        boolean[] exists = new boolean[b];
        for (int i = a; i <= a * b; i += a) {
            int num = i % b;
            exists[num] = true;
        }
        
        if (exists[c]) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}