import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.start();
	}

	public void start() {
		Scan sc = new Scan();
		int inputs[] = new int[3];
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		System.out.println(getResult(a, b, c));

	}

	private String getResult(int a, int b, int c) {

		boolean tmps[] = new boolean[b];
		int count = 1;
		while (true) {
			int tmp = (a * count) % b;
			if(tmp==0){
				count++;
				continue;
				
			}
			if (tmps[tmp]) {
				return "NO";
			} else {
				tmps[tmp] = true;
			}
			
			if (c % tmp == 0) {
				return "YES";
			}
			count++;
		}

	}

}

class Scan {
	BufferedReader br;
	StringTokenizer st;

	public Scan() {
		br = new BufferedReader(new InputStreamReader(System.in));
	}

	public String next() {
		while (st == null || !st.hasMoreTokens()) {
			try {
				st = new StringTokenizer(br.readLine());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return st.nextToken();
	}

	public int nextInt() {
		return Integer.parseInt(next());
	}

}