import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<TMP> list = new ArrayList();
        long ans = 0;

        for (int i = 0; i < n; i++) {
            String s = sc.next();
            s = str_sort(s);

            boolean isAdd = false;
            for (int j = 0; j < list.size(); j++) {
                int cnt = list.get(j).isCheck(s);
                if (cnt > 0) {
                    isAdd = true;
                    ans += cnt;
                    break;
                }
            }
            if (!isAdd) {
                TMP tmp = new TMP(s);
                list.add(tmp);
            }
        }

        System.out.println(ans);
    }

    static String str_sort(String a) {
        char[] re = a.toCharArray();

        for (int i = 0; i < re.length-1; i++) {
            for (int j = i+1; j < re.length; j++) {
                if (re[i] > re[j]) {
                    char tmp = re[j];
                    re[j] = re[i];
                    re[i] = tmp;
                }
            }
        }

        return new String(re);
    }

    static class TMP {
        String s;
        int cnt = 1;

        TMP(String tmp) {
            s = new String(tmp);
        }

        int isCheck(String tmp) {
            if (s.equals(tmp)) {
                cnt++;
                return cnt-1;
            }
            return 0;
        }
    }
}