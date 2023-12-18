import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] s = sc.next().toCharArray();
        int ans = 1;
        for (int i = 1; i < n; i++) {
            if(s[i-1] != s[i])ans++;
        }
        System.out.println(ans);
        sc.close();

    }

}
