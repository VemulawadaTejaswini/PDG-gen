import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.ListIterator;

class Main {

    public static void main(String[] args) throws IOException {
        doit(args, System.in, System.out);
    }

    static void doit(String[] args, InputStream in, PrintStream out)
            throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        String line = null;
        while ((line = reader.readLine()) != null) {
            if (line.isEmpty()) {
                continue;
            }
            int n = Integer.parseInt(line);
            if (n == 0) {
                break;
            }
            double[][] points = new double[n][2];
            for (int i = 0; i < n; i++) {
                String[] values = reader.readLine().split(",");
                points[i][0] = Double.parseDouble(values[0]);
                points[i][1] = Double.parseDouble(values[1]);
            }
            Arrays.sort(points, new Comparator<double[]>() {
                @Override
                public int compare(double[] o1, double[] o2) {
                    return (int) (o1[0] - o2[0]);
                }
            });
            if (opz(points, 0, 1, 2) < 0.0) {
                swap(points, 1, 2);
            }
            LinkedList<Integer> vertexes = new LinkedList<Integer>();
            vertexes.add(0);
            vertexes.add(1);
            vertexes.add(2);
            int result = 0;
            for (int i = 3; i < n; i++) {
                int a = vertexes.getLast();
                boolean outer = false;
                ListIterator<Integer> it = vertexes.listIterator();
                while (it.hasNext()) {
                    int b = it.next();
                    if (opz(points, a, b, i) < 0) {
                        it.previous();
                        it.add(i);
                        outer = true;
                        break;
                    }
                    a = b;
                }
                if (!outer) {
                    result++;
                }
            }
            ListIterator<Integer> it = vertexes.listIterator();
            int a = it.next();
            int b = it.next();
            while (it.hasNext()) {
                int c = it.next();
                if (opz(points, a, b, c) < 0) {
                    it.previous();
                    it.previous();
                    it.remove();
                    result++;
                    b = it.next();
                    continue;
                }
                a = b;
                b = c;
            }
            if (opz(points, vertexes.get(vertexes.size() - 2), vertexes
                    .getLast(), vertexes.getFirst()) < 0) {
                result++;
            }
            out.println(result);
        }
    }

    private static void swap(double[][] points, int a, int b) {
        if (a == b) {
            return;
        }
        double[] tmp = points[a];
        points[a] = points[b];
        points[b] = tmp;
    }

    private static double opz(double[][] points, int a, int b, int c) {
        double x1 = points[b][0] - points[a][0];
        double y1 = points[b][1] - points[a][1];
        double x2 = points[c][0] - points[b][0];
        double y2 = points[c][1] - points[b][1];
        return x1 * y2 - x2 * y1;
    }
}