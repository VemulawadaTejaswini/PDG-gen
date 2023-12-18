import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] line = br.readLine().split(" ");
		String s = line[0];
		String t = line[1];
		line = br.readLine().split(" ");
		int a = Integer.parseInt(line[0]);
		int b = Integer.parseInt(line[1]);
		String u = br.readLine();
		br.close();
		if(u.equals(s)) {
			a--;
		}else if(u.equals(t)) {
			b--;
		}
		System.out.println(a + " " + b);
	}

}
