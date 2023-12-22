import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println(process(readAll(System.in)));
    }

    protected static String process(String data) {
        final String[] lines = splitForLines(data);

        final List<Integer> list = split(lines[1]);

        final Integer min = Collections.min(list);
        final Integer max = Collections.max(list);

        int sum = 0;
        for(Integer i : list){
            sum += i;
        }

        return min + " " + max + " " + sum;
    }

    private static String readAll(InputStream is) {
        InputStreamReader r = null;
        BufferedReader br = null;

        try {
            r = new InputStreamReader(is);
            br = new BufferedReader(r);
            StringBuilder sb = new StringBuilder();
            String s;

            while ((s = br.readLine()) != null) {
                sb.append(s).append('\n');
            }

            return sb.toString();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                }
            }
            if (r != null) {
                try {
                    r.close();
                } catch (IOException e) {
                }
            }
        }
    }

    private static List<Integer> split(String s) {
        final String[] s0 = s.split(" ");
        List<Integer> list = new ArrayList<Integer>(s0.length);

        for (String aS0 : s0) {
            list.add(Integer.valueOf(aS0));
        }

        return list;
    }

    private static String[] splitForLines(String lines) {
        return lines.split("\\n");
    }

}