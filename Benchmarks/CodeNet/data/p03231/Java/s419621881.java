
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long m = sc.nextInt();
        long k = n * m;
        char s[] = sc.next().toCharArray();
        char t[] = sc.next().toCharArray();
        while (n != m){
            if(n > m)n -= m;
            else m -= n;
        }
        k /= n;
        int q = (int)(k / n);
        int ss = (int)(k / s.length);
        int tt = (int)(k / t.length);
        for (int i = 0;i < n;++i){
            int x = i * q;
            if(s[x / ss] != t[x / tt]){
                System.out.println(-1);
                return;
            }
        }
        System.out.println(k);

    }

}



