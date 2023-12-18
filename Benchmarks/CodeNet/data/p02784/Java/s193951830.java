import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String args[]) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] parts1 = br.readLine().split(" ");
		String[] parts2 = br.readLine().split(" ");
		
		int H = Integer.parseInt(parts1[0]);
		int N = Integer.parseInt(parts1[1]);
		
		int s = 0;
		for (int i = 0; i < parts2.length; i++) {
			s+=Integer.parseInt(parts2[i]);
		}
		
		if(s>=H) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
			
	}

}