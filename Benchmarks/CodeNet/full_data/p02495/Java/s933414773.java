import java.io.*;
import java.util.*;
class Main {
	
	public static void draw(int a, int b) {
		
		int cnt = 0;
		
		for(int i = 1; i <= a; i++) {
			for(int j = 1; j <= b; j++) {
				if(cnt % 2 == 0) {
					System.out.print("#");
				} else
					System.out.print(".");
				cnt++;
			}
			System.out.println();
			if(b % 2 == 0) cnt++;
		}
		
	}
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = 
			new BufferedReader(new InputStreamReader(System.in));
		
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			if (a == 0 && b == 0) break;
			list1.add(a);
			list2.add(b);
		}
		for (int i = 0; i < list1.size(); i++) {
			draw(list1.get(i),list2.get(i));
			System.out.println();
		}
	}
	
}