import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by yousack on 2014/07/25.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String s = in.readLine();
            if (s.equals("0")) break;
            String[] cary = s.split("");
            int[] nary = new int[cary.length];
            for (int i = 0, l = cary.length; i < l; i++) {
                nary[i] = Integer.parseInt(cary[i]);
            }
            int sum = 0;
            for (int n: nary) {
                sum += n;
            }
            System.out.println(sum);
        }

    }
}