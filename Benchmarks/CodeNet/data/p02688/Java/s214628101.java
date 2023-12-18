import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int ninz = scan.nextInt(), syuru = scan.nextInt();
		int hito[] = new int[ninz];
		
		for(int i = 0; i < syuru; i++) {
			int ha = scan.nextInt();
			for(int j = 0; i < ha; j++) {
				hito[scan.nextInt() - 1]++;
				
			}
			
			
		}
		
		syuru = 0;
		
		for(int i = 0; i < ninz; i++) {
			if(hito[i] == 0) {
				syuru++;
			}
			
		}
		
		System.out.println(syuru);
		
		
	}
		
		
		
}
