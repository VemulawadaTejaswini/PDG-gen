import java.util.ArrayList;
import java.util.Scanner;
 
public class Main {
	public static void main(String args[]) {
		ArrayList<String> direction = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		
		int np = sc.nextInt();
		String d = sc.next();
		
		
		for(int i = 0; i < np; i++) {
			direction.add(d.substring(i, (i+1)));
		}
		
		int count = 0;
		for(int i = 0; i < np; i++) {
			int cc = 0;
			
			if(i == 0) {
				
				for(int n = 0; n < np; n++) {
					if(n < i) {
						if(direction.get(n).equals("W")) {
							cc++;
							
						}
					}
					
					if(n > i) {
						if(direction.get(n).equals("E")){
							cc++;
						}
					}
				}
				
				count = cc;
				
			}else {
				
				for(int n = 0; n < np; n++) {
					if(n < i) {
						if(direction.get(n).equals("W")) {
							cc++;
							
							if(cc >= count) {
								break;
							}
							
						}
					}
					
					if(n > i) {
						if(direction.get(n).equals("E")){
							cc++;
							
							if(cc >= count) {
								break;
							}
						}
					}
				}
				
				count = Math.min(count, cc);
				
			}
			
		}
		
		System.out.println(count);
		
	}
}