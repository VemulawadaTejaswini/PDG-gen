import java.util.*;

class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		double p = Math.PI;
		double r = sc.nextDouble();
		System.out.println(String.format("%.7f",r*r*p)+" "+String.format("%.7f",2*r*p));
		
	}
}
