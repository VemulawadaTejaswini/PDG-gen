import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        long[][] a = new long[26][s.length];
        a[s[0] - 'a'][0] = 1;
        for (int i = 1; i < s.length; i++) {
            for (int j = 0; j < 26; j++) a[j][i] = a[j][i-1];
            a[s[i] - 'a'][i]++;
        }
        long ans = 1;
        for (int i = 0; i < s.length; i++) {
            int len = s.length -1 - i;
            int idx = s[i] - 'a';
            ans += len - (a[idx][s.length-1] - a[idx][i]);
        }
        System.out.println(ans);
        sc.close();

    }

}
