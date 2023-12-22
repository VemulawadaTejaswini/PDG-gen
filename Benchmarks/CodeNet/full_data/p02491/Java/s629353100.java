import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int a,b;
		a=cin.nextInt();
		b=cin.nextInt();
		System.out.print(a/b+" ");
		System.out.print(a % b+" ");
		System.out.print((double)a/(double)b);
	}

}