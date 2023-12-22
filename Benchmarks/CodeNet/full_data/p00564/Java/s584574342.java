import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String args[]) throws IOException {
		int Ans = 0;

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String s1 = new String(in.readLine());

		String[] a = s1.split(" +");
		
		int N = Integer.parseInt(a[0]);

		int A = Integer.parseInt(a[1]);
		int B = Integer.parseInt(a[2]);
		
		int C = Integer.parseInt(a[3]);
		int D = Integer.parseInt(a[4]);
		
		int n_a = N / A + ((N % A) == 0? 0 : 1 );
		
		int n_c = N / C +  ((N % C) == 0? 0 : 1 );
	
		Ans = (n_a * B < n_c * D ? n_a * B : n_c * D);
		
		System.out.println(Ans);
	}
}
