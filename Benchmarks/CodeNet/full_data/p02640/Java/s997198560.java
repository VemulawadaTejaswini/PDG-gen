import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inputs = new Scanner(System.in);
		int X = inputs.nextInt();
		int Y = inputs.nextInt();
		if((Y-2*X)%2==0) {
			int b = (Y-2*X)/2;
			int a = X-b;
			if(a<0||b<0) {
				System.out.println("No");
			}
			else if(2*a+4*b==Y)
				System.out.println("Yes");
			else
				System.out.println("No");
		}
		else {
			System.out.println("No");
		}
	}

}
