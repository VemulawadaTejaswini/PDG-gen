import java.util.*;

class Main{
	private static Scanner scan = null;
	public static void main(String[] args){
		scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int d = (int)a / (int)b;
		int r = (int)a % (int)b;
		double f = a / b;
		String str = String.format("%.5f",f);
		System.out.println(d+" "+r+" "+str);
	}
}