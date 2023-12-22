import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int left = 1;
        int right = n;
        StringBuilder sb = new StringBuilder();
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < m; i++) {
            int a = right - left;
            int b = left - right + n;
            if (a == b || set.contains(a) || set.contains(b)) {
                right--;
            }
            set.add(a);
            set.add(b);
            sb.append(left).append(" ").append(right).append("\n");
            left++;
            right--;
        }
        System.out.print(sb);
    }
}
