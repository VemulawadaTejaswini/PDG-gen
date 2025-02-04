import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			int lim = Integer.parseInt(in.readLine());
			String[] se = in.readLine().split(" ");
			
			int max = 0;
			int[] a = new int[lim];
			for (int i = 0; i < lim; i++) {
				a[i] = Integer.parseInt(se[i]);
				if (max < a[i]) max = a[i];
			}
			
			int[] c = new int[max + 1];
			for (int i = 0; i < (max + 1); i++) {
				c[i] = 0;
			}
			
			for (int i = 0; i < lim; i++) {
				c[a[i]] = c[a[i]] + 1;
			}
			
			for (int i = 1; i < (max + 1); i++) {
				c[i] = c[i] + c[i - 1];
			}
			
			int[] b = new int[lim];
			for (int i = (lim - 1); i >= 0; i--) {
				b[(c[a[i]] - 1)] = a[i];
				c[a[i]] = c[a[i]] - 1;
			}

			String s = String.valueOf(b[0]);
			for (int i = 1; i < lim; i++) {
				s = s + " " + b[i];
			}
			System.out.println(s);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}