
import java.util.Scanner;

/**
 * Created by enpingkuang on 2020/9/10 10:58 下午
 */
public class B {
    public static void Main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        String t = scanner.next();
        int ans = 10000;
        for(int i = 0;i<t.length();i++){
            for(int j = 0;j<s.length();j++){
                int x = 0;
                int index_t = i;
                int index_s = j;
                while(index_t<t.length() && index_s<s.length() && t.charAt(index_t) == s.charAt(index_s)){
                    x++;
                    index_s++;
                    index_t++;
                }
                ans = Math.min(s.length() - x,ans);
            }
        }
        System.out.println(ans);
    }
}
