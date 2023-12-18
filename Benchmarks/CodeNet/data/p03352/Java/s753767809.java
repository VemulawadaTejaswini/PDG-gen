import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        String line = readLine();
        StringTokenizer st = new StringTokenizer(line, " ");
        int x = Integer.parseInt(st.nextToken());

        double X = (double)x;
        List<Double> list = new ArrayList<Double>();

        for (int i=1; i<=x; i++) {
        	for (int j=2;j<=32;j++) {
        		if (Math.pow((double)i, (double)j)>X) {
        			break;
        		}
        		list.add(Math.pow((double)i, (double)j));
        	}
        }
        double ans = Collections.max(list);
        System.out.println(String.valueOf((int)ans));

    }

    private static String readLine() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        return br.readLine();
    }
}
