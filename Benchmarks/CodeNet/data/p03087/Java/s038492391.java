import java.util.Scanner;

public class Main {
	public static void main(String args[]) {	
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int q = Integer.parseInt(sc.next());
		String s = sc.next();
		int[] map = new int[s.length()+1];
		int count=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='A'&&i+1<s.length())
				if(s.charAt(i+1)=='C') {
					count++;
					map[i+1] = map[i] + count;
				}
			map[i+1] = count;
			
		}
		
		
		for(int i=0;i<q;i++) {
			int a = Integer.parseInt(sc.next());
			int b = Integer.parseInt(sc.next());
			System.out.println(map[b-1]-map[a-1]);
		}
		
	}
	
	
}
