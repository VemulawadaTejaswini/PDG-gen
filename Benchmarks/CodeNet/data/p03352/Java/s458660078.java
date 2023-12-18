
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		int X;
		int Y = 0;
		do{
		Scanner stdIn= new Scanner(System.in);
			X = stdIn.nextInt();
		}while(X<1||5000<X);
		for(int i =0;i*i<=X;i++){
			Y=i*i;
		}
		System.out.println(Y);

	}

}