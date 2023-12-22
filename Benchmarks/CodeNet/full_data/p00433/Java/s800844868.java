import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a, b;
		int scoreA, scoreB;
		
		scoreA = 0;
		scoreB = 0;
		
		
		for(int i = 0; i < 4; i++){
			a = scan.nextInt();
			b = scan.nextInt();
			
			scoreA += a;
			scoreB += b;
		}
		
		if(scoreA >= scoreB)System.out.println(scoreA);
		else System.out.println(scoreB);
	}
}