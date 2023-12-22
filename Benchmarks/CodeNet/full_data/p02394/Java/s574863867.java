public class Main {
	
		
		public static void main(String[] args) {
			java.util.Scanner scan = new java.util.Scanner(System.in);
		int W = scan.nextInt();
		int H = scan.nextInt();
		int x = scan.nextInt();
		int y = scan.nextInt();
		int r = scan.nextInt();
		if(-100 <= x && x <= 100 && -100 <= y && y <= 100 && 0 < r && r <= 100 && 0 < W && W <=100 && 0 < H && H <= 100){
		if( W >= (x + r) && H >= (y + r) && (y+r)>0 && (x+r)>0){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
		}
		}
		
		
		
		}