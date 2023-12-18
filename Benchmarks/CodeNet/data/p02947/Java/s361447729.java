import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n];
        for (int i=0;i<n; i++) {
            s[i] = sc.next();
        }

        Map<String, Integer> map = new HashMap<>();
        for (String str : s ) {
            char[] cL = str.toCharArray();
            Arrays.sort(cL);
            String sss = String.valueOf(cL);
            int count = map.getOrDefault(sss, 0);
            map.put(sss, ++count);
        }
        int ans = 0;
        for (Integer c :map.values()) {
            if (c > 0) ans += (c * (c-1)) / 2;
        }
        System.out.println(ans);
    }
}
