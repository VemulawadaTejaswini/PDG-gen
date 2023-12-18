
import java.util.*;

/**
 * https://beta.atcoder.jp/contests/abc103/tasks/abc103_b
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();

        if(s.length() != t.length()){
            System.out.println("No");
            return;
        }

        List<String> slist = new ArrayList<>();
        List<String> tlist = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            slist.add(s.substring(i, i + 1));
            tlist.add(t.substring(i, i + 1));
        }

        Collections.sort(slist);
        Collections.sort(tlist);

        for (int i = 0; i < s.length(); i++) {
            if(! Objects.equals(slist.get(i), tlist.get(i))){
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}
