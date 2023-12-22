import java.io.*;
import java.util.*;
class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = 
			new BufferedReader(new InputStreamReader(System.in));
		
		ArrayList<String> list = new ArrayList<String>();
		
		int n = Integer.parseInt(br.readLine());
		int cnt = 0;
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		while(cnt != n) {
			list.add(st.nextToken());
			cnt++;
		}
		
		for (int i = list.size() - 1; i >= 0; i--) {
			System.out.print(list.get(i));
			if(i != 0) System.out.print(" ");
		}
	}
	
}