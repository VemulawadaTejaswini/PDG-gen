import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		int A = sc.nextInt();
		int B = sc.nextInt();

		double x=0;
		double y=0;
		x=A/0.08;
		y=B/0.1;
		int X=(int)x;
		int Y=(int)y;
		if(X==Y)
		System.out.println(X);
		else
		System.out.println("-1");
	}
}
		 


