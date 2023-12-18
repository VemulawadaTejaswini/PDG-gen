import java.awt.*;
import java.util.*;
import java.util.List;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        List<Point> redPoints = new ArrayList<>();
        List<Point> bluePoints = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            redPoints.add(new Point(sc.nextInt(), sc.nextInt()));
        }
        for (int i = 0; i < N; i++) {
            bluePoints.add(new Point(sc.nextInt(), sc.nextInt()));
        }

        redPoints.sort(new PointSort());
        bluePoints.sort(new PointSort());

        int cnt = 0;
        for (Point bp : bluePoints) {

            Point rp = null;

            for (Point tmprp: redPoints) {
                if (tmprp.x >= bp.x) {
                    break;
                }

                // 出来るだけ大きいYのポイントを取る
                if (rp == null || (rp.y < tmprp.y && tmprp.y < bp.y)){
                    rp = tmprp;
                }
            }

            if(rp != null){
                cnt++;
                redPoints.remove(redPoints.indexOf(rp));
            }
        }

        out.println(cnt);
    }

    public static class PointSort implements Comparator<Point> {
        @Override
        public int compare(Point o1, Point o2) {
            return Integer.compare(o1.x, o2.x);
        }
    }
}