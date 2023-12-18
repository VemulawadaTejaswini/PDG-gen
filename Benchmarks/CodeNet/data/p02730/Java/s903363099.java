import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner can = new Scanner(System.in);
		String kaibun = can.next();
		char bunkai[] = new char[kaibun.length()];
		
		for(int i = 0; i < kaibun.length(); i++) {
			bunkai[i] = kaibun.charAt(i);
			
		}
		
		for(int i = 0; i < (kaibun.length() - 1) / 2; i++) {
			if(bunkai[i] != bunkai[kaibun.length() - 1 - i]) {
				System.out.println("no");
				System.exit(0);
				
			}
			
		}
		
		for(int i = 0; i < ((kaibun.length() - 1) / 2 - 1) / 2; i++) {
			if((bunkai[i] != bunkai[((kaibun.length() - 1) / 2) - i - 1]) ||(bunkai[(kaibun.length() - 1)/ 2 + 1 + i] != bunkai[kaibun.length() - 1 - i])) {
				System.out.println("no");
				System.exit(0);
				
			}
			
		}
		
		System.out.println("yes");
		
		
	}
	
}