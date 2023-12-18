import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int N = sc.nextInt();
        int Q = sc.nextInt();
        String S = sc.next();

        int[] ls = new int[Q];
        int[] rs = new int[Q];
        for (int i = 0; i < Q; i++) {
            ls[i] = sc.nextInt() - 1;
            rs[i] = sc.nextInt() - 1;
        }

        char[] chars = S.toCharArray();
        int[] acCount = new int[N];
        int count = 0;
        for (int i = 1; i < S.length(); i++) {
            if (chars[i-1] == 'A' && chars[i] == 'C') {
                count++;
            }
            acCount[i] = count;
        }

        for (int i = 0; i < Q; i++) {
            int ans = acCount[rs[i]] - acCount[ls[i]];
            System.out.println(ans);
        }

    }

}