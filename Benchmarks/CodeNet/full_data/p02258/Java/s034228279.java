import java.io.*;

public class Main {
	public static void main(String[] args) {
		int MAX = 200000;
		int n;
		int[] R;
		
		R = new int[MAX];
		
		BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
		try{
			String line = reader.readLine();
			
			n = Integer.parseInt(line);
			for(int i = 0; i < n; i++ ) {
				line =reader.readLine();
				R[i] = Integer.parseInt(line);
			}
			
			int maxv = -2000000000;
			int minv = R[0];
			
			for ( int i = 1; i < n ; i++) {
				maxv = Math.max(maxv, R[i] -minv);
				minv = Math.min(minv, R[i]);
			}
			
			System.out.println(maxv);
			
		} catch (IOException e) {
			System.out.println(e);
		} catch (NumberFormatException e) {
			System.out.println("??°????????\?????????????????????");
		}
	}
}
		