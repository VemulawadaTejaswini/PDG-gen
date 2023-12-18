import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char[] cs = s.next().toCharArray();
        int k = s.nextInt();
        char max = 'z' + 1;

        for (int i = 0; i < cs.length - 1; ++i) {
            int sub = max - cs[i];
            if (k < sub) {
                continue;
            }
            k -= sub;
            cs[i] += sub % (max - 'a');
            if (cs[i] >= max) {
                cs[i] -= max - 'a';
            }
        }
        cs[cs.length - 1] += k % (max - 'a');
        if (cs[cs.length - 1] >= max) {
            cs[cs.length - 1] -= max - 'a';
        }
        System.out.println(new String(cs));
    }
}
