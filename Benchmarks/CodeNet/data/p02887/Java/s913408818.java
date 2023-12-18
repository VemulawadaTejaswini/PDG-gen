import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
        StringBuilder ans = new StringBuilder();
        char prev = '0';
        for (int i = 0; i < N; i++) {
            char c = S.charAt(i);
            if (prev != c) {
                ans.append(c);
            }
            prev = c;
        }
        System.out.println(ans.length());
    }
}
