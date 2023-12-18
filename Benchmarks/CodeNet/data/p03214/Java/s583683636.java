import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> a = new ArrayList<>();
        int max = 0;
        for (int i = 0; i < n; i++) {
            int k = sc.nextInt();
            max += k;
            a.add(k);
        }
        int average = max / n;
        int min = max;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (Math.abs(average - a.get(i)) < min) {
                min = Math.abs(average - a.get(i));
                ans = i;
            }
        }
        System.out.println(ans);
    }
}
