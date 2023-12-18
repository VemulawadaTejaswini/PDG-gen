import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

import java.io.BufferedReader;
import java.io.FileReader;

public class Main{
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		
		int n= sc.nextInt();
		
		int[] a = new int[n];
		
		for (int i = 0; i < a.length; i++) {
			a[i]= sc.nextInt(); 
		}
		boolean possibe = true;
		for (int i = 0; i < a.length-1; i++) {
			if (a[i] > a[i+1]) {
				a[i]--;
			}
			else {
				if (i > 0 && a[i-1] <= a[i]-1 && a[i] == a[i+1]) {
					a[i]--;
				}
			}
		}
		
		for (int i = 0; i < a.length-1; i++) {
			if (a[i] > a[i+1]) {
				possibe = false;
			}
		}
		
		if (possibe) {
			out.print("Yes");
		}
		else {
			out.print("No");
		}
		
		out.flush();
	}
		
}	
	
class Scanner {
	StringTokenizer st;
	BufferedReader br;

	public Scanner(InputStream system) {
		br = new BufferedReader(new InputStreamReader(system));
	}
	
	public Scanner (String file) throws IOException{
        br=new BufferedReader(new FileReader(file));
	}

	public String next() throws IOException {
		while (st == null || !st.hasMoreTokens())
			st = new StringTokenizer(br.readLine());
		return st.nextToken();
	}

	public String nextLine() throws IOException {
		return br.readLine();
	}

	public int nextInt() throws IOException {
		return Integer.parseInt(next());
	}

	public double nextDouble() throws IOException {
		return Double.parseDouble(next());
	}

	public char nextChar() throws IOException {
		return next().charAt(0);
	}

	public Long nextLong() throws IOException {
		return Long.parseLong(next());
	}

	public boolean ready() throws IOException {
		return br.ready();
	}

	public void waitForInput() throws InterruptedException {
		Thread.sleep(3000);
	}


}

