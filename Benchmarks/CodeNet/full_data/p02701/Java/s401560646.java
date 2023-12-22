import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int kaisuu = scan.nextInt();
		int syurui = 1;
		String zenbu = "";
		String kei[] = new String[kaisuu];
		
		kei[0] = scan.next();
		
		for(int i = 1; i < kaisuu; i++) {
			kei[i] = scan.next();
			boolean a = true;
			
			for(int j = 0;j < i; j++ ) {
				if(kei[i].equals(kei[j])) {
					a = false;
					
				}
				
			}
			
			if(a) {
				syurui++;
				
			}
			
			
		}
		
		
		System.out.println(syurui);
		
		
	}
		
		
		
}