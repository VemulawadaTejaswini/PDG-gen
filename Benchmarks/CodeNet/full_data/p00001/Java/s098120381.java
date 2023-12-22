
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] argv) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> m = new ArrayList<Integer>();
        while(true) {
            String s = in.readLine();
            if (s == null) {
                break;
            }
            m.add(Integer.parseInt(s));
        }
        f(m);
    }

    public static void f(ArrayList<Integer> m) {
        Object[] mm = m.toArray();
        Arrays.sort(mm);
        for (int i = mm.length - 1; i > mm.length - 4 && i >= 0; i--) {
            System.out.println(mm[i]);
        }
    }
}