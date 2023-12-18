import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        String line = readLine();
        StringTokenizer st = new StringTokenizer(line, " ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());

        int dis_ac = Math.abs(c-a);
        int dis_ab = Math.abs(b-a);
        int dis_bc = Math.abs(c-b);

        if (d >= dis_ac ) {
        	System.out.println("Yes");
        } else if ((d >= dis_ab)&&(d >= dis_bc)) {
        	System.out.println("Yes");
        } else {
        	System.out.println("No");
        }
    }

    private static String readLine() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        return br.readLine();
    }

}