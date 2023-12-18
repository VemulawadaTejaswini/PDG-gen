import java.awt.*;
import java.util.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<String, List<Point>> map = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            int p = sc.nextInt();
            if(map.containsKey(s)) {
                map.get(s).add(new Point(p, i+1));
            } else {
                map.put(s, new ArrayList<Point>());
                map.get(s).add(new Point(p, i+1));
            }
        }
        for(List<Point> list: map.values()) {
            list.sort(Comparator.comparingInt(o -> o.x));
            Collections.reverse(list);
            for (Point p : list) {
                System.out.println(p.y);
            }
        }
    }
}