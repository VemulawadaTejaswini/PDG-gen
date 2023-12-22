import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	private static int nico;
	private static int[] elements;
	
	public static void main(String[] args) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	    
		try {
			nico = Integer.parseInt(in.readLine());
			
			String[] se = in.readLine().split(" ");
			elements = new int[nico];
			for (int i = 0; i < nico; i++) {
				elements[i] = Integer.parseInt(se[i]);
			}
			
			int lim = Integer.parseInt(in.readLine());
			se = in.readLine().split(" ");
			
			int[] qs = new int[lim];
			for (int i = 0; i < nico; i++) {
				qs[i] = Integer.parseInt(se[i]);
			}
			
			for (int i = 0; i < lim; i++) {
				if (search(qs[i], 0) == true) System.out.println("yes");
				else System.out.println("no");
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static boolean search(int m, int i) {
		if (m == 0) return true;
		if ((m < 0) || i == nico) return false;

		if (search(m - elements[i], i++) == false) return search(m, i++);
		return true;
	}
}