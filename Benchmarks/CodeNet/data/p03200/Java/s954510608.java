import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        String[] array = br.readLine().split("");
        int size = array.length;
        int N = 0;
        boolean changed = true;
        while (changed) {
            int cur = N;
            for (int i = 0; i < size - 1; i++) {
                if (array[i].equals("B") && array[i + 1].equals("W")) {
                    array[i] = "W";
                    array[i + 1] = "B";
                    N++;
                    break;
                }
            }
            if (cur == N) {
                changed = false;
            }
        }
        out.println(N);
        out.close();
    }
}
