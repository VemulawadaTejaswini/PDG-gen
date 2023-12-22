import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		int n = Integer.parseInt(br.readLine());
		
		int maxv = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		for(int i = 0; i < n; i++){
			int r = Integer.parseInt(br.readLine());
			maxv = Math.max(maxv, r - min);
			min = Math.min(min, r);
		}
		
		System.out.println(maxv);
		
	}
}
