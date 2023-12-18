import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int kaisuu = scan.nextInt();
		int syurui = 0;
		String zenbu = "";
		
		for(int i = 0; i < kaisuu; i++) {
			String a = scan.next();
			if(!zenbu.matches(".*" + a + ".*")) {
				syurui++;
				zenbu += a;
				
			}
			
		}
		
		System.out.println(syurui);
		
		
	}
		
		
		
}