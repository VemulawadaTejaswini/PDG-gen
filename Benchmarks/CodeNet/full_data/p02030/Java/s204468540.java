import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        TreeSet<Integer> orSet = new TreeSet<>();
        ArrayList<Integer> andList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            orSet.add(sc.nextInt());
        }
        for (int i = 0; i < m; i++) {
            int x = sc.nextInt();
            if (orSet.contains(x)) {
                andList.add(x);
            } else {
                orSet.add(x);
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(andList.size()).append(" ").append(orSet.size()).append("\n");
        for (int x : andList) {
            sb.append(x).append("\n");
        }
        for (int x : orSet) {
            sb.append(x).append("\n");
        }
        System.out.print(sb);
    }
}
