import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Main {

    private static final String LINE_SEPARATOR = System.getProperty("line.separator");

    public static void main(String[] args) {
        System.out.println(process(readAll(System.in)));
    }

    protected static String process(String data) {
        final String[] split = data.split("\\n");

        int i = 1;
        StringBuilder sb = new StringBuilder();
        for (String s : split) {
            if ("0".equals(s)) {
                break;
            }
            if (sb.length() > 0) {
                sb.append(LINE_SEPARATOR);
            }
            sb.append("Case ").append(i++).append(": ").append(s);
        }

        return sb.toString();
    }

    protected static String readAll(InputStream is) {
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
}