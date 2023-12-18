import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int Q = sc.nextInt();
        StringBuffer ans = new StringBuffer(S);
        boolean reverse = false;
        for (int i = 0; i < Q; i++) {
            int T = sc.nextInt();
            if (T == 1) {
                reverse = !reverse;
            } else {
                int F = sc.nextInt();
                char C = sc.next().toCharArray()[0];
                if (!reverse) {
                    if (F == 1) {
                        ans.insert(0, C);
                    } else {
                        ans.append(C);
                    }
                } else {
                    if (F == 1) {
                        ans.append(C);
                    } else {
                        ans.insert(0, C);
                    }
                }
            }
        }
        if (reverse) {
            ans = ans.reverse();
        }

        System.out.println(ans.toString());
    }
}
