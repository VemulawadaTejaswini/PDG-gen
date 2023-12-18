
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		int tempA = 0;
		int tempB = 0;
		int tempC = 0;
		int count = 0;


		if(a==b && b==c){
			System.out.println("-1");
		}else{
			while(a%2!=1 && b%2!=1 && c%2!=1){
				tempA = a/2;
				tempB = b/2;
				tempC = c/2;
				a = tempB + tempC;
				b = tempC + tempA;
				c = tempA + tempB;
				count++;
			}
			System.out.println(count);
		}

	}

}
