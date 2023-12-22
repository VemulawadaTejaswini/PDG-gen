import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        var n = Integer.parseInt(in.readLine());
        var cnt = new HashMap<Integer, Integer>();
        StringTokenizer st = new StringTokenizer(in.readLine());
        int sum = 0;
        for (int i = 0; i < n; i++) {
            var a = Integer.parseInt(st.nextToken());
            cnt.put(a, cnt.getOrDefault(a, 0) + 1);
            sum += a;
        }
        var q = Integer.parseInt(in.readLine());
        var sol = new int[q];
        for (int i = 0; i < q; i++) {
            st = new StringTokenizer(in.readLine());
            var b = Integer.parseInt(st.nextToken());
            var c = Integer.parseInt(st.nextToken());
            if (!cnt.containsKey(b)) {
                sol[i] = sum;
                continue;
            }
            var value = cnt.get(b);
            sum -= (value * b);
            sum += (value * c);
            cnt.remove(b);
            cnt.put(c, cnt.getOrDefault(c, 0) + value);
            sol[i] = sum;
        }
        for (var i : sol) {
            System.out.println(i);
        }
    }
}
