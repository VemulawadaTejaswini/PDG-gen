import java.util.*;
// . >
class Main{
	static Scanner in = new Scanner(System.in);

	public static void main(String args[]){	
		// String a = in.nextLine();
		int n = scInt(), k = scInt();
		n = (n % 2 == 0) ? n / 2 : n / 2 + 1;
		int r = n / 2;
		pl( ( (int)(Math.pow(k, n) ) + ( (int)Math.pow((k - 1), r) ) ) + "");
		
	}

	public static int scInt(){return in.nextInt();}
	public static double scDbl(){return in.nextDouble();}
	public static String scStr(){return in.next();}
	public static String scLne(){return in.nextLine();}

	public static void pl(String s){System.out.println(s);}	

}
