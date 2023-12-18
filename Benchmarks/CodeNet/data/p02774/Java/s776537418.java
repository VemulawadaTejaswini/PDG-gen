import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        Long[] a = new Long[n];
        for(int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }

        List<Long> ans = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            for(int j = i+1; j <n; j ++) {
                ans.add(a[i] * a[j]);
            }
        }
        Collections.sort(ans);
        System.out.println(ans.get(k-1));
    }
}