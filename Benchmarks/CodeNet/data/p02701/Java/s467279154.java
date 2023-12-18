import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int kaisuu = scan.nextInt();
		String moji[] = new String[kaisuu];
		int syurui = 0;
		String zenbu = "";
		
		for(int i = 0; i < kaisuu; i++) {
			moji[i] = scan.next();
			if(zenbu == "" || !zenbu.matches(".*" + moji[i] + ".*")) {
				syurui++;
				
			}
			
			zenbu += moji[i];
		}
		
		System.out.println(syurui);
		
		
	}
		
		
		
}
