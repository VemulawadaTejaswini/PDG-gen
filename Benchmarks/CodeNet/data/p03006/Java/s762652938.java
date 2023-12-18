import java.awt.Point;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        Point[] points = new Point[n];
        for(int i = 0; i < n; i++) {
            String[] in = br.readLine().split(" ");
            int x = Integer.parseInt(in[0]);
            int y = Integer.parseInt(in[1]);
            points[i] = new Point(x, y);
        }

        Map<Point, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                Point tmp;
                if(points[i].x > points[j].x) {
                    tmp = new Point(points[i].x - points[j].x, points[i].y - points[j].y);
                }else {
                    tmp = new Point(points[j].x - points[i].x, points[j].y - points[i].y);
                }
                if(map.containsKey(tmp)) map.put(tmp, map.get(tmp) + 1);
                else map.put(tmp, 1);
            }
        }

        int max = map.values().stream().max(Comparator.naturalOrder()).get();
        System.out.println(n - max);
    }
}