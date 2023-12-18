import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner can = new Scanner(System.in);
		String kaibun = can.next();
		char bunkai[] = new char[kaibun.length()];
		
		for(int i = 0; i < (kaibun.length() - 1) / 2;i++) {
			if(kaibun.charAt(i) != kaibun.charAt(kaibun.length() - 1)) {
				System.out.println("no");
				System.exit(0);
				
			}
			
		}
		
		for(int i = 0; i < ((kaibun.length() - 1) /2 - 1) /2 ; i++){
			if(kaibun.charAt(i) != kaibun.charAt((kaibun.length() - 1) / 2 - 1 - i)){
				System.out.println("no");
				System.exit(0);
				
			}
			
		}
		
		System.out.println("yes");
		
	}
	
}