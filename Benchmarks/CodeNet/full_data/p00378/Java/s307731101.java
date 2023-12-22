import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int x = sc.nextInt();
		
		if(a < b) {
			System.out.println((int) Math.ceil((double) x / 1000) * a); 
		}else if(a < b * 2) {
			if(x % 1000 <= 500 && x % 1000 > 0) {
				System.out.println((int) x / 1000 * a + b);
			}else {
				System.out.println((int) Math.ceil((double) x / 1000) * a); 
			}
		}else {
			System.out.println((int) Math.ceil((double) x / 500) * b); 
		}
	}
}
