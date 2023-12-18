import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        List<Integer> l = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < n; i++)
            ans.add(i + 1);
        for (int i = 0; i < n; i++)
            l.add(s.nextInt());

        for (int i = 0; i < n; i++) {
            for (int k = 0; k < n-i; k++) {
                if (k == 0)
                    continue;
                if (l.get(k - 1) > l.get(k)) {
                    int tmp = l.get(k - 1);
                    int tmp2 = ans.get(k - 1);
                    l.set(k - 1, l.get(k));
                    ans.set(k - 1, ans.get(k));
                    l.set(k, tmp);
                    ans.set(k, tmp2);
                }
            }
        }
        for (int i = 0; i < n; i++)
            System.out.print(ans.get(i)+"\t");
    }
}