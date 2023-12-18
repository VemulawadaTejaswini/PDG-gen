import java.awt.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        // abc 113 C 連想配列っぽくやる?

        int n = sc.nextInt();
        int m = sc.nextInt();
        Point[] junban = new Point[m];

        Map<Integer, ArrayList<Integer>> list = new HashMap<>();

        for (int i = 0; i < m; i++) {
            int p = sc.nextInt();
            int year = sc.nextInt();
            junban[i] = new Point(p, year);
            ArrayList<Integer> value = list.get(p);
            if (value == null) {
                value = new ArrayList<>();
            }
            value.add(year);
            list.put(p, value);
        }

        for(Integer key : list.keySet()) {
            ArrayList<Integer> l = list.get(key);
            Collections.sort(l);
        }

        for (int i = 0; i < m; i++) {
            Point p = junban[i];
            StringBuilder builder = new StringBuilder();
            for (int j = 0; j < 6 - String.valueOf(p.x).length(); j++) {
                builder.append(0);
            }
            builder.append(p.x);
            int v = list.get(p.x).indexOf(p.y) + 1;
            for (int j = 0; j <  6 - String.valueOf(v).length(); j++) {
                builder.append(0);
            }
            builder.append(v);
            System.out.println(builder);
        }
    }
}