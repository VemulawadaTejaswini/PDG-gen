import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int result = 0;
        int ans = 0;
        while (result < n - 2) {
            result = s.indexOf("ABC", result);
            if (result != -1) {
                ans++;
                result++;
            }else{
                break;
            }
        }
        System.out.println(ans);
    }
}