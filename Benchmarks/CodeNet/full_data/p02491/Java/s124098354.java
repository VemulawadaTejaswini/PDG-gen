import java.util.*;

class Main{
	private static Scanner scan = null;
	public static void main(String[] args){
		scan = new Scanner(System.in);
		float a = scan.nextInt();
		float b = scan.nextInt();
		int d = (int)a / (int)b;
		int r = (int)a % (int)b;
		float f = a / b;
		System.out.println(d+" "+r+" "+f);
	}
}