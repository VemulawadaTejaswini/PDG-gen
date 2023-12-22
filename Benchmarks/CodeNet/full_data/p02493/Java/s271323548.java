import java.io.*;
import java.util.*;
class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = 
			new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int[] list = new int[n];
		int cnt = 0;
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		while(cnt != n) {
			list[cnt] = Integer.parseInt(st.nextToken());
			cnt++;
		}
		
		for (int i = list.length - 1; i >= 0; i--) {
			System.out.print(list[i]);
			if(i != 0) System.out.print(" ");
		}
	}
	
}