import java.util.*;

class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int x;
		double pi = 3.14159;
		x = sc.nextInt();
		System.out.printf("%5f %5f",(double)pi*x*x,(double)2*pi*x);
	}
}