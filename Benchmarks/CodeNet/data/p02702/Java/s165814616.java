import java.util.*;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int[] ten = new int[s.length() + 1];
        ten[0] = 1;
        for (int i = 1; i < s.length() + 1; i++) {
            ten[i] = (ten[i - 1] * 10) % 2019;
        }

        long res = 0;

        int[] mod = new int[s.length()];
        int[] ans = new int[2019];
        ans[0]++;
        mod[0] = Integer.parseInt(s.substring(s.length() - 1, s.length()));
        ans[mod[0]]++;
        for (int i = 1; i < s.length(); i++) {
            mod[i] = (mod[i - 1] + (Integer.parseInt(s.substring(s.length() - i - 1, s.length() - i)) * ten[i] % 2019))
                    % 2019;
            ans[mod[i]]++;
            // System.out.println(mod[i]);
        }
        for (int i = 0; i < 2019; i++) {
            res += (ans[i] * (ans[i] - 1)) / 2;
        }
        System.out.println(res);

        sc.close();
    }
}
