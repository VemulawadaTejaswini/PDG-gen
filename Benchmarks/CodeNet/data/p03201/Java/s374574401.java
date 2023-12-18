import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;
import java.util.stream.Collectors;
 
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int N = Integer.parseInt(br.readLine());
        List<Integer> list = Arrays.stream(br.readLine().split(" "))
            .map(Integer::parseInt)
            .sorted()
            .collect(Collectors.toList());
        boolean[] array = new boolean[N];

        int max = list.get(N - 1) + list.get(N - 2);
        int t =  - 1;
        while (Math.pow(2, t + 1) < max) {
            t++;
        }

        int ans = 0;
        while (t > 0) {
            int beki = (int)Math.pow(2, t);
            outside: for (int i = 0; i < list.size() - 1; i++) {
                if (array[i]) {
                    continue outside;
                }
                int a = list.get(i);
                if (a >= beki) {
                    break outside;
                }
                inside: for (int j = i + 1; j < list.size(); j++) {
                    if (array[j]) {
                        continue inside;
                    }
                    int b = list.get(j);
                    if (a + b == beki) {
                        ans++;
                        array[i] = true;
                        array[j] = true;
                        continue outside;
                    }
                }
            }
            t--;
        }

        out.println(ans);
        out.close();
    }
}
