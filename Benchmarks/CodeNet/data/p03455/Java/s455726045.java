import java.util.*;
public class A {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		if(a*b %2 ==1)
			System.out.println("Odd");
		else
			System.out.println("Even");
	}

}