import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class Main {
	public static void main(String[] args) throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	    int s = Integer.parseInt(br.readLine());

	    SimpleDateFormat sdf = new SimpleDateFormat("H:m:s");
	    Timestamp ts = new Timestamp(0, 0, 0, 0, 0, s, 0);
	    System.out.println(sdf.format(ts));
	}
}