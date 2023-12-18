import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] vals = reader.readLine().split(" ");
        int N = Integer.parseInt(vals[0]);
        int K = Integer.parseInt(vals[1]);
        List<Integer> list = new LinkedList<Integer>();
        for (int i = 0; i < N; i++) {
            vals = reader.readLine().split(" ");
            int a = Integer.parseInt(vals[0]);
            int b = Integer.parseInt(vals[1]);
            for (int j = 0; j < b; j++) {
                list.add(a);
            }
        }
        Collections.sort(list);
        System.out.println(list.get(K - 1));
    }
}
