import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String line;

		int vs = 0,vm=0,c=0;
		while ((line = bf.readLine()) != null) {
			String[] s = line.split(",");
			if(s.length!=2)break;
			int u = Integer.parseInt(s[0]);
			int m = Integer.parseInt(s[1]);
			c++;
			vs+=u*m;
			vm+=m;
		}
		System.out.println(vs);
		System.out.println(Math.round((double)vm/c));
	}
}