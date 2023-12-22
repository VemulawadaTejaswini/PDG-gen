import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int ans = n;
        while (true) {
            if (ans <= 0) {
                break;
            }
            ans -= 1000;
        }
        System.out.println(-ans);
    }
}
