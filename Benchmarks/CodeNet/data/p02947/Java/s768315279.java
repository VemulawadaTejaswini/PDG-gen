import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<TMP> list = new ArrayList();

        for (int i = 0; i < n; i++) {
            char[] s = sc.next().toCharArray();
            int[] a = new int[26];
            for (int j = 0; j < 10; j++) {
                a[Math.abs('a' - s[j])]++;
            }

            boolean isAdd = false;
            for (int j = 0; j < list.size(); j++) {
                if (list.get(j).isCheck(a)) {
                    isAdd = true;
                    break;
                }
            }
            if (!isAdd) {
                TMP tmp = new TMP(a);
                list.add(tmp);
            }
        }

        int ans = 0;
        for (int i = 0; i < list.size(); i++) {
            int cnt = list.get(i).cnt;

            for (int j = 1; j < cnt; j++) {
                ans += cnt - j;
            }
        }

        System.out.println(ans);
    }

    static class TMP {
        int[] a = new int[26];
        int cnt = 1;

        TMP(int[] tmp) {
            a = tmp.clone();
        }

        boolean isCheck(int[] tmp) {
            boolean isSame = true;
            for (int i = 0; i < 10; i++) {
                if (a[i] != tmp[i]) {
                    isSame = false;
                    break;
                }
            }

            if (isSame)
                cnt++;
            return isSame;
        }
    }
}