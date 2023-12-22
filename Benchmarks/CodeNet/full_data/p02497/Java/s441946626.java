import java.io.*;
import java.util.*;
class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = 
			new BufferedReader(new InputStreamReader(System.in));
		
		int m, f, r;
		ArrayList<String> result = new ArrayList<String>();
		
		while (true) {
			
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			m = Integer.parseInt(st.nextToken());
			f = Integer.parseInt(st.nextToken());
			r = Integer.parseInt(st.nextToken());
			
			if (m == -1 && f == -1 && r == -1) break;
			
			if (m + f >= 80) {
				result.add("A");
			} else if (m + f >= 65) {
				result.add("B");
			} else if (m + f >= 50 || r >= 50) {
				result.add("C");
			} else if (m + f >= 30) {
				result.add("D");
			} else if ((m == -1 || f == -1) || m + f < 30) {
				result.add("F");
			}
			
		}
		
		for (int i = 0; i < result.size(); i++) {
			System.out.println(result.get(i));
		}
	}
	
}