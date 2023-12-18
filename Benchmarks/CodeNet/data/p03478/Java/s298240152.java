import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ans = 0;
        
        for(int i = 1; i <= cnt; i++){
            int sum = (i / 10) + (i % 10);
            if (a <= sum && b >= sum){
                ans += i;
            }
        }
        
        System.out.println(ans);
        
    }
}
