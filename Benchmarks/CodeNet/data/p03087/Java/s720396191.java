import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int q = sc.nextInt();
        char[] s = sc.next().toCharArray();

        List<Integer> list = new ArrayList<>();
        for (int i = 1; i < s.length; i++) {
            if (s[i-1] == 'A' && s[i] == 'C') {
                list.add(i);
            }
        }

        int[] ans = new int[q];
        for (int i = 0; i < q; i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            int cnt = 0;
            for (int j = 0; j < list.size(); j++) {
                int num = list.get(j);
                if (num >= l && num < r)
                    cnt++;
            }
            ans[i] = cnt;
        }
        
        for (int i : ans)
            System.out.println(i);
    }
}
