import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        char[] c = sc.next().toCharArray();
        int ans = 0;
        if(s[0] == c[0]) ans++;
        if(s[1] == c[1]) ans++;
        if(s[2] == c[2]) ans++;
        System.out.println(ans);
        sc.close();

    }

}
