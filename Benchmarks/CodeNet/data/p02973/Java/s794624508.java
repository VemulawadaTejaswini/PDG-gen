import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        int N = sc.nextInt();
        PrintWriter out = new PrintWriter(System.out);
        TreeMap<Integer, Integer> map = new TreeMap<>();
        int color = 0;
        for (int i=0; i<N; i++) {
            Integer A = sc.nextInt();
            Map.Entry<Integer, Integer> entry = map.floorEntry(A-1);
            if (entry == null) {
                if (map.containsKey(A)) {
                    Integer val = map.get(A);
                    map.put(A, val+1);
                    color += 1;
                } else {
                    map.put(A, 1);
                    color += 1;
                }
            } else {
                map.remove(entry.getKey());
                if (entry.getValue() > 1) {
                    map.put(entry.getKey(), entry.getValue()-1);
                }
                if (map.containsKey(A)) {
                    Integer val = map.get(A);
                    map.put(A, val+1);
                } else {
                    map.put(A, 1);
                }
            }
        }
        out.println(color);
        out.flush();
    }
}