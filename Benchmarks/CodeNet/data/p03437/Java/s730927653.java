import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int x = stdIn.nextInt();
		int y = stdIn.nextInt();
		
		if(x>=y && x% y ==0) {
			System.out.println(-1);
		}else if(x>y) {
			System.out.println(x);
		}else {
			System.out.println(x);
		}
		
	}

}
