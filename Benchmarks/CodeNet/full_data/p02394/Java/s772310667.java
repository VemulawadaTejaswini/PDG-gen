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
		
		if(-100 < x && x < 100 && -100 < y && y < 100){
			if(0 < W && W <= 100 && 0 < H && H <= 100 && 0 < r && r <= 100){
				if(x + r <= W && y + r <= H){
					System.out.println("yes");
				}
				else{
					System.out.println("No");
				}
			}
		}
	}
}