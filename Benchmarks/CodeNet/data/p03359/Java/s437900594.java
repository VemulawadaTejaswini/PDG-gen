import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ans = 0;

        if (a <= b) {
            ans = a;
        } else {
            ans = a - 1;
        }

        System.out.println(ans);
        sc.close();
    }    
}
