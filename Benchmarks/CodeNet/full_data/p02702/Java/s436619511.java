import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        for(int i = 0;i < (s.length / 2);i++) {
            char tmp = s[i];
            s[i] = s[s.length - i - 1];
            s[s.length - i - 1] = tmp;
        }
        
        int[] a = new int[s.length];
        for(int i = 0;i < s.length;i++) {
            a[i] = (int) (((s[i] - '0') * Math.pow(10, i)) % 2019);
        }
 
        int[] d = new int[s.length];
        d[0] = (s[0] - '0') % 2019;
        for(int i = 1;i < s.length;i++) {
            d[i] = (d[i - 1] + a[i]) % 2019;
        }
        
        int[] result = new int[2019];
        int ans = 0;
        result[0] = 1;
        for(int i = 0;i < d.length;i++) {
            ans += result[d[i] % 2019];
            result[d[i] % 2019] += 1;
        }

        System.out.println(ans);
    }
}