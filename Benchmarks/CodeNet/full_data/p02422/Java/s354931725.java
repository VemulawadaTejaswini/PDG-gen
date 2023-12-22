import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String text = br.readLine();
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String[] lines = br.readLine().split(" ");
            int begin = Integer.parseInt(lines[1]);
            int end = Integer.parseInt(lines[2])+1;
            if (lines[0].equals("print")) {
                System.out.println(text.substring(begin, end));
            } else if (lines[0].equals("replace")) {
                text = text.replace(text.substring(begin, end), lines[3]);
            } else {
                String origin = text.substring(begin, end);
                StringBuffer sb = new StringBuffer(origin);
                text = text.replace(origin, sb.reverse());
            }
        }
    }
}