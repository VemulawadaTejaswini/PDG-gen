import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int sx = stdIn.nextInt();
		int sy = stdIn.nextInt();
		int tx = stdIn.nextInt();
		int ty = stdIn.nextInt();
		
		for(int i = sy; i <=ty; i++) {
			System.out.print('U');
		}
		for(int i = sx; i < tx; i++) {
			System.out.print('R');
		}
		for(int i = ty; i > sy; i--) {
			System.out.print('D');//
		}
		for(int i = tx; i > sx; i--) {
			System.out.print('L');
		}
		//ここまでで1週
		System.out.print('L');//
		
		for(int i = sy; i < ty; i++) {
			System.out.print('U');
		}
		System.out.print('U');
		System.out.print('R');
		
		for(int i = sx; i < tx; i++) {
			System.out.print('R');
		}
		System.out.print('D'); //tx,tyに到着
		
		System.out.print('R');
		
		for(int i = ty; i > sy; i--) {
			System.out.print('D');
		}
		System.out.print('D');
		System.out.print('L');
		
		for(int i = tx; i > sx; i--) {
			System.out.print('L');
		}
		System.out.print('U');
		
		
	}

}
