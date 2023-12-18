import java.io.PrintWriter;
import java.util.*;

public class Main {

    static String br = System.getProperty("line.separator");
    static Scanner sc = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        int N = nextInt();

        Map<Integer, List<Integer>> map = new HashMap<>();

        for (int i = 0; i < N; i++) {
            int A = nextInt();
            int B = nextInt();
            List<Integer> list = new ArrayList<>();
            if (map.containsKey(B)) {
                list = new ArrayList<>(map.get(B));
            }
            list.add(A);
            map.put(B, list);
        }

        List<Integer> keys = new ArrayList<>(map.keySet());
        Collections.sort(keys);

        int time = 0;
        boolean flag = false;
        for (int i = 0; i < keys.size(); i++) {
            for (int j = 0; j < map.get(keys.get(i)).size(); j++) {
                int A = map.get(keys.get(i)).get(j);
                int B = keys.get(i);
                time += A;
                if (time > B) {
                    flag = true;
                    break;
                }
            }
        }

        println(flag ? "No" : "Yes");
    }

    //最小公倍数lcm
    static long lcm (long a, long b) {
        long temp;
        long c = a;
        c *= b;
        while((temp = a%b)!=0) {
            a = b;
            b = temp;
        }
        return (c/b);
    }

    static int nextInt() {
        return Integer.parseInt(next());
    }

    static Long nextLong() {
        return Long.parseLong(next());
    }

    static String next() {
        return sc.next();
    }

    static String nextLine(){
        return sc.nextLine();
    }

    static void println(Object o) {
        out.println(o);
        out.flush();
    }

    static void print(Object o) {
        PrintWriter out = new PrintWriter(System.out);
        out.print(o);
        out.flush();
    }
}
