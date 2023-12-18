import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        String line = readLine();
        StringTokenizer st = new StringTokenizer(line, " ");
        Integer x = Integer.parseInt(st.nextToken());
        Integer a = Integer.parseInt(st.nextToken());
        Integer b = Integer.parseInt(st.nextToken());

        if ( a >= b) {
        	System.out.println("delicious");
        }else if ( (a + x) >= b) {
        	System.out.println("safe");
        }else {
        	System.out.println("dangerous");
        }

    }

    private static String readLine() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        return br.readLine();
    }
}
