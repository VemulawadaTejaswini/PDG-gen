import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        String[] rest = new String[n];
        String[] score = new String[n];
        int[] base = new int[n];
        for (int i = 0; i < n; i++) {
            rest[i] = sc.next();
            score[i] = sc.next();
            base[i] = 1000 - Integer.parseInt(score[i]);
        }
        String[] rank = new String[n];
        for (int i = 0; i < n; i++) {
            rank[i] = rest[i] + "_" + base[i] + "_" + score[i] + "_" + (i + 1);
        }
        Arrays.sort(rank);
        for (String str : rank) {
            String[] tmp = str.split("_");
            System.out.println(tmp[3]);
        }
    }
}
