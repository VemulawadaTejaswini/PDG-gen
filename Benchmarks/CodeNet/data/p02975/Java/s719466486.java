import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		int n = 0;
		try {
			n = Integer.parseInt(br.readLine());	
		} catch (IOException e) {
			e.getStackTrace();
		}
		
		int a[] = new int[n];
		try {
			line = br.readLine();
			String lines[] = line.split(" ");
			for (int i = 0; i < n; i++) a[i] = Integer.parseInt(lines[i]);
		} catch (IOException e) {
			e.getStackTrace();
		}
		
		boolean ans[] = new boolean[n];
		for(int i = 0; i < n; i++) {
			ans[i] = false;
			for(int j = 0; j < n; j++) {
				if(i != j) {
					for(int k = 0; k < n; k++) {
						if(i != k || j != k) {
							if(a[i] == (a[j]^a[k])) {
								ans[i] = true;
							}
						}
					}
				}
			}
		}
		
		String yn = "Yes";
		for(int i = 0; i < n; i++) {
			if(ans[i] == false) yn = "No";
		}
		System.out.println(yn);		
	}
}
