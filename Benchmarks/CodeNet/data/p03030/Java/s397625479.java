import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        int N = Integer.parseInt(br.readLine());
        List<List<String>> list = new ArrayList<>();
        
        for (int i = 0; i < N; i++) {
            String[] arr = br.readLine().split(" ");
            List<String> l = Arrays.asList(arr[0], arr[1], String.valueOf(i+1));
            list.add(l);
        }

        list.sort((x, y) -> {
            if (x.get(0).equals(y.get(0))) {
                return Integer.parseInt(y.get(1)) - Integer.parseInt(x.get(1));
            } else {
                return x.get(0).compareTo(y.get(0));
            }
        });

        for (List<String> l: list) {
            out.println(l.get(2));
        }
        out.close();
    }
}
