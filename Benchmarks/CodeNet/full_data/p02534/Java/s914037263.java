import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public void execute(int input) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		if (input == 1) {
			br = new BufferedReader(new FileReader("test.txt"));
		}

		int n = Integer.parseInt(br.readLine());
		
		for(int i=0; i<n; i++) {
			System.out.print("ACL");
		}
	}

	public static void main(String[] args) throws Exception {

		Main a = new Main();

		a.execute(0);

	}
}