import java.io.*;
import java.util.*;
class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = 
			new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		String[] list = new String[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		for (int i = 0; i < n; i++) {
			list[i] = st.nextToken();
		}
		
		for (int i = list.length - 1; i >= 0; i--) {
			System.out.print(list[i]);
			if(i != 0) System.out.print(" ");
		}
	}
	
}