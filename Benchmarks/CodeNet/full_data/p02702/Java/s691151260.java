import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String s = sc.next();
        
        int n = s.length();
        int[] digit = new int[n];
        for(int i = 0; i < n; i++){
            digit[i] = s.charAt(i) - '0';
        }
        int[] count = new int[2019];
        count[0] = 1;
        long ans = 0;
        int cur = 0;
        int pow = 1;
        for(int i = n-1; i >= 0; i--){
            cur += pow * digit[i];
            cur %= 2019;
            ans += count[cur];
            count[cur]++;
            pow *= 10;
            pow %= 2019;
        }
        System.out.println(ans);
    }
}