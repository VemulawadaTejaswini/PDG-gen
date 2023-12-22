import java.io.*;
import java.util.*;
class Main {
	
	public static void draw(int a, int b) {
		for(int i = 1; i <= a; i++) {
			System.out.print("#");
		}
		System.out.println();
		for (int i = 2; i <= a - 1; i++) {
			System.out.print("#");
			for(int j = 1; j <= a - 2; j++) {
				System.out.print(".");
			}
			System.out.print("#");
			System.out.println();
		}
		for(int i = 1; i <= a; i++) {
			System.out.print("#");
		}
		System.out.println();
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