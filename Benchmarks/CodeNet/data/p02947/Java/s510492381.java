import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        HashMap<String, Integer> map = new HashMap<>();
        long ans = 0;

        for (int i = 0; i < n; i++) {
            String s = sc.next();
            s = str_sort(s);

            if (map.get(s) == null) {
                map.put(s, 1);
            } else {
                int val = map.get(s);
                ans += val;
                map.replace(s, val+1);
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
}