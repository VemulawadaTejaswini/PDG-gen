import java.util.Scanner;

class Main {
	public static void main(String[] args) {
	
	Scanner stdIn = new Scanner(System.in);
	
	byte n = stdIn.nextByte();
	int ncake = 0;
	int ndonut = 0;
	int total;
	
	do {
	
		do{
		
			total = 4*ncake + 7*ndonut;
					
			if (total == n) {
				System.out.println("Yes");
				return;
			}
		
			ndonut = ndonut + 1;
		
		} while (total <= 100);
		
		ndonut = 0;
		
		ncake = ncake + 1;
		
		total = 0;
		total = 4*ncake + 7*ndonut;
		
	} while (total <= 100);
	
	System.out.println("No");
	
	}

}