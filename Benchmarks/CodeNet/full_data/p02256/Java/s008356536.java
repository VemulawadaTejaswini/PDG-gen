import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter two numbers: ");
		int int1 = input.nextInt();
		int int2 = input.nextInt();
		int gcd = 1;
		while(int1 >= int2) {
			int temp = int2;
			int2 = int1 % int2;
			if(int2 == 0) {
				gcd = temp;
				break;
			}
			int1 = temp;
		}
		System.out.print(gcd);
	}
}

