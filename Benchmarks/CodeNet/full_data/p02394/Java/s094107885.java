import java.util.Scanner;

class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int W = scan.nextInt();
		int H = scan.nextInt();
		int x = scan.nextInt();
		int y = scan.nextInt();
		int r = scan.nextInt();
		
		if(x - r >= 0 && x + r <= W && y - r >= 0 && y + r <= H){
			System.out.println("yes");	
		}
		else if (x - r < 0 && x + r > W && y - r < 0 && y + r > H){
			System.out.println("No");
		}
	}
}