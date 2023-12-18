import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        String line = readLine();
        StringTokenizer st = new StringTokenizer(line, " ");
        String input = st.nextToken();
        String[] kigou = input.split("");
        int counter = 0;

        for (String tmp:kigou) {
        	if (tmp.equals("+")) {
        		counter++;
        	}else {
        		counter--;
        	}
        }

        System.out.println(counter);

    }

    private static String readLine() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        return br.readLine();
    }
}