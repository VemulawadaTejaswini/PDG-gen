import java.util.Scanner;

public class Main {

    static char[] s;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int q = sc.nextInt();
        s = sc.next().toCharArray();

        int[] cnt100 = new int[n/100 + 1];
        int tmp = 0;
        for (int i = 0; i < s.length; i+=100) {
            if (i+100 <= s.length) {
                cnt100[tmp++] = counter(i, i + 99);
            } else {
                cnt100[tmp++] = counter(i, s.length-1);
            }
        }

        int[] ans = new int[q];
        for (int i = 0; i < q; i++) {
            int l = sc.nextInt()-1;
            int r = sc.nextInt()-1;
            int cnt = 0;
            int diff = r - l;

            if (diff >= 100) {
                int l100 = (l%100==0 ? l/100 : l/100+1)*100;
                int r100 = (r%100==0 ? r/100 : r/100-1)*100;
                cnt += cnt100[l100/100 + 1];
                cnt += counter(l, l100);
                cnt += counter(r100, r);
            } else {
                cnt += counter(l, r);
            }

            ans[i] = cnt;
        }

        for (int i : ans)
            System.out.println(i);
    }

    // lとrの間にあるACの個数を数えて返す
    static int counter(int l, int r) {
        int cnt = 0;
        for (int i = l+1; i <= r; i++) {
            if (s[i-1] == 'A' && s[i] == 'C') {
                cnt++;
                i++;
            }
        }

        return cnt;
    }
}
