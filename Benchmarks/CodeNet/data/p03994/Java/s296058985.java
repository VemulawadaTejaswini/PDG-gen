import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int K = sc.nextInt();
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int diff = 26-(c-'a');
            if (i  < s.length()-1) {
                if (c != 'a' && K >= diff) {
                    K -= diff;
                    ans.append('a');
                } else {
                    ans.append(c);
                }
            } else {
                ans.append((char)('a'+(c-'a'+K)%26));
            }
        }

        System.out.println(ans.toString());
    }
}

