import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        long n = Long.parseLong(sc.next());
        int k = 26;
        StringBuilder ans = new StringBuilder();
        while(true) {
            char a = (char)(n % k + 96);
            if(n % k == 0) {
                a = 'z';
            }
            ans.insert(0 ,a); 
            n /= k;
            if(n % k == 0 && n == 1 || n == 0) break;
        }
        System.out.println(ans);
    }
}
