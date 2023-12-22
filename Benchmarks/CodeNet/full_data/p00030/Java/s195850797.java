
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";
		while(!(line = br.readLine()).equals("0 0")){
			String s[] = line.split(" ");
			int n = Integer.parseInt(s[0]);
			int b = Integer.parseInt(s[1]);
			System.out.println(soi(n, b, -1));
		}
	}
	static int soi(int n, int s, int i) {
		if (n == 0) {
			return (s == 0) ? 1 : 0;
		}
		int a = 0;
		int l = Math.min(s, 9);
		for (i = i + 1; i <= l; i++) {
			a += soi(n - 1, s - i, i);
		}
		return a;
	}

}