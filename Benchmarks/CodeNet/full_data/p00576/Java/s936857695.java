import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashSet<Integer> place = new HashSet<>();
        int[] pieces = new int[n];
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            pieces[i] = x;
            place.add(x);
        }
        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            int idx = sc.nextInt() - 1;
            if (pieces[idx] != 2019 && !place.contains(pieces[idx] + 1)) {
                place.remove(pieces[idx]);
                pieces[idx]++;
                place.add(pieces[idx]);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int x : pieces) {
            sb.append(x).append("\n");
        }
        System.out.print(sb);
     }
}
