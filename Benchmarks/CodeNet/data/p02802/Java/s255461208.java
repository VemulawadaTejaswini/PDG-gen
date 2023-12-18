import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.next());
		int m = Integer.parseInt(sc.next());
		
		
		boolean[] q = new boolean[n];
		
		
		int ac = 0;
		int wa = 0;
		
		for(int i=0 ; i < n ; i++) {
			q[i] = false;
		}
		
		for(int i=0 ; i < m ; i++) {
			int p = Integer.parseInt(sc.next());
			String s = sc.next();
			if(!q[p-1]) {
				if(s.equals("AC")) {
					ac++;
					q[p-1] = true;
				}else {
					wa++;
				}
			}
			
			
			
		}
		
		System.out.println(ac + " " + wa);
		

	}
}