import java.util.Scanner;
 
public class Main {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		int np = sc.nextInt();
		String d = sc.next();
		
		
		int count = np;
		for(int i = 0; i < np; i++) {
			int cc = 0;
			boolean endI = false;
			
			for(int n =0; n < i; n++) {
				char target = d.charAt(n);
				if(target == 'W') {
					cc++;
					
					if(cc >= count) {
						endI = true;
						break;
					}
					
				}
			}
			
			if(endI = true) {
				continue;
			}
			
			for(int n = (i+1); n < np; n++) {
				char target = d.charAt(n);
				if(target == 'E') {
					cc++;
					
					if(cc >= count) {
						break;
					}
					
				}
			}
			
			count = Math.min(count, cc);
			
		}
		
		System.out.println(count);
		
	}
}