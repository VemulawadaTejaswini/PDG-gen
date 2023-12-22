import java.util.Scanner;

public class Main_C {
	public static void main(String[] args){
		@SuppressWarnings("resource")
		Scanner stdin = new Scanner(System.in);
		
		int a = stdin.nextInt();
		int b = stdin.nextInt();
		int c = stdin.nextInt();
		
		for(int i = 0; i < 3; i++) {
			if(a < b) {
				int aa = a;
				a = b;
				b = aa;
			} else if (a > c) {
				int aa = a; 
				a = c;
				c = aa;
			} else if (b > c) {
				int aaa = b;
				b = c;
				c = aaa;
			}
		}
		
		
		System.out.print(a + " " + b + " " + c);
	}

}