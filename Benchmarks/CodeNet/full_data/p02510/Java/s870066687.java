import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader stdReader = new BufferedReader(new InputStreamReader(System.in));
            ArrayList<String> ans = new ArrayList<String>();
            String line = null;
            String st = "";
            int times = 0;
            while (true) {
                line = stdReader.readLine();
                line.trim();
                if (line.equals("-")) {
                    ans.add(st);
                    break;
                }
                try {
                    int cutpoint = Integer.parseInt(line);
                    if (times == 0) {
                        times = cutpoint;
                    } else {
                        String bottom = st.substring(0, cutpoint);
                        String top = st.substring(cutpoint, st.length());
                        st = top + bottom;
                        times--;
                    }
                } catch(NumberFormatException e) {
                    if (st != null) {
                        ans.add(st);
                    }
                    st = new String(line);
                }
            }
            for (int i = 1; i < ans.size(); i++) {
                System.out.println(ans.get(i));
            }
        } catch (Exception e) {
            System.out.println(e);
            e.getStackTrace();
            System.exit(-1);
        }
    }
}