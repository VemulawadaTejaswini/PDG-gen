import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	    String[] line = br.readLine().split(" ");
	    double x1 = Integer.parseInt(line[0]);
	    double y1 = Integer.parseInt(line[1]);
	    double x2 = Integer.parseInt(line[2]);
	    double y2 = Integer.parseInt(line[3]);

	    double x = Math.pow(Math.abs(x1 - x2), 2);
	    double y = Math.pow(Math.abs(y1 - y2), 2);

	    double ans = Math.pow(x + y , 0.5);

	    System.out.println(ans);
	}
}