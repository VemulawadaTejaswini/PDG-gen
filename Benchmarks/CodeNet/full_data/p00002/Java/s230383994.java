import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	static int Count(int x) {
		int y = 1;
		while ((float) (x / 10) > 1){
			y++;
			x/=10;}
		return y;

	}

	public static void main(String[] args) {
		while(true){
		Scanner scan = new Scanner(System.in);
		try{
		int a = -1;
		a = scan.nextInt();
		if(a < 0)	return;
		int b = scan.nextInt();
		int c = a+b;
		int x = Count(c);
		System.out.println(x);
		}catch(InputMismatchException e){
			return;
		}
		}
	}

}