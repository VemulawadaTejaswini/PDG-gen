import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		int i;
		if(a < b) {
			for(i = 0; i < b; i++) {
				System.out.print(a);
			}
		}else {
			for(i = 0; i < a; i++) {
				System.out.print(b);
			}
		}
	}
}