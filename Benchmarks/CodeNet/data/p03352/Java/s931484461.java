import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        String line = readLine();
        StringTokenizer st = new StringTokenizer(line, " ");
        int x = Integer.parseInt(st.nextToken());

        double y = 2.0;
        for (int i=1; i<x; i++) {
        	double I = (double)i;


        	if (Math.pow(I, y)>(double)x) {
        		double ans = Math.pow(I-1.0, y);
        		int answer = (int)ans;
        		System.out.println(String.valueOf(answer));
        		break;
        	}
        }

    }

    private static String readLine() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        return br.readLine();
    }
}