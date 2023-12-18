import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		@SuppressWarnings("resource")
		String kaibun = new Scanner(System.in).next();
		
		for(int i = 0; i < (kaibun.length() - 1) / 2;i++) {
			if(kaibun.charAt(i) != kaibun.charAt(kaibun.length() - 1 - i)) {
				System.out.println("No");
				System.exit(0);
				
			}
			
		}
		
		for(int i = 0; i < ((kaibun.length() - 1) /2 - 1) /2 ; i++){
			if(kaibun.charAt(i) != kaibun.charAt((kaibun.length() - 1) / 2 - 1 - i)){
				System.out.println("No");
				System.exit(0);
				
			}
			
		}
		
		System.out.println("Yes");
		
	}
	
}
