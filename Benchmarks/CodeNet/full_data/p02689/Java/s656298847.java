import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int tenbou = scan.nextInt(), miti = scan.nextInt();
		int hyoukou[] = new int[tenbou];
		int kanri[] = new int[tenbou]; 
		
		int good = 0;
		
		for(int i = 0; i < tenbou; i++) {
			hyoukou[i] = scan.nextInt();
					
			
		}
		
		for(int i = 0; i < miti; i++) {
			int a = scan.nextInt(), b = scan.nextInt();
			
			if(kanri[a - 1] < hyoukou[b - 1]) {
				kanri[a - 1] = hyoukou[b - 1];
 			}
			
			if(kanri[b - 1] < hyoukou[a - 1]) {
				kanri[b - 1] = hyoukou[a - 1];
 			}
			
		}
		
		
		
		for(int i = 0; i < tenbou; i++) {
			boolean how = true;
			
			if(hyoukou[i] <= kanri[i]) {
					how = false;
					
			}
				
			if(how) good++;
			
			
			
		}
		
		System.out.println(good);
		
	}
		
		
		
}

