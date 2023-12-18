import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        for(int i = 1; i <= n; i++){
            ans += i-1;
        }
        System.out.println(ans);
    }
}