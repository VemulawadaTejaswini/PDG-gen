import java.awt.geom.Point2D;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

import static java.lang.System.*;


public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        ArrayList<Point2D> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(in.readLine());
            double x = Double.parseDouble(st.nextToken());
            double y = Double.parseDouble(st.nextToken());
            a.add(new Point2D.Double(x, y));
        }

        double longest = Double.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                double dist = distance(a.get(i), a.get(j));
                if (dist > longest) {
                    longest = dist;
                }
            }
        }

        out.println(Math.sqrt(longest)/2.0);

    }

    static double distance(Point2D a, Point2D b) {
        double xa = a.getX();
        double xb = b.getX();
        double x = xa - xb;
        double ya = a.getY();
        double yb = b.getY();
        double y = ya - yb;
        return  Math.pow(x, 2) +  Math.pow(y, 2);
    }

}
