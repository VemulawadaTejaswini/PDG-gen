import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int N = Integer.parseInt(br.readLine());
        List<List<Long>> list = new ArrayList<>();
        long ans = 0;
        for (int i = 0; i < N; i++) {
            String[] arr =  br.readLine().split(" ");
            list.add(Arrays.asList(
                Long.parseLong(arr[0]),
                Long.parseLong(arr[1]),
                Long.parseLong(arr[0]) - Long.parseLong(arr[1])
            ));
        }
        list.sort((a, b) -> {
                if (a.get(2) - b.get(2) != 0) {
                    return b.get(2) - a.get(2) > 0 ? 1 : -1;
                } else {
                    return b.get(0) - a.get(0) > 0 ? 1 : -1;
                }
            }
        );
        for (int i = 0; i < N; i++) {
            if (i % 2 == 0) {
                ans += list.get(i).get(0); 
            } else {
                ans -= list.get(i).get(1);
            }
        }
        out.println(ans);
        out.close();
    }
}