
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        int n = 0;
        creature[] cs = null;
        int sum = 0;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String[] elems = br.readLine().split(" ");
            n = Integer.parseInt(elems[0]);
            cs = new creature[n];
            elems = br.readLine().split(" ");
            for (int i = 0; i < cs.length; i++) {
                cs[i] = new creature(i, Integer.parseInt(elems[i]));

            }
            cs = Arrays.stream(cs).sorted((c1, c2) ->
                    Integer.compare(c1.size, c2.size)).toArray(creature[]::new);
        } catch (IOException e) {
            e.printStackTrace();
        }
        int ans = 0;
        int i;
        for (i = 0; i < cs.length - 1; i++) {
            sum += cs[i].size*2;
            if (sum > cs[i+1].size)
                break;
        }
        System.out.println(cs.length - i);
    }
}

class creature {
    int color;
    int size;
    public creature(int c, int s) {
        color = c;
        size = s;
    }
}
