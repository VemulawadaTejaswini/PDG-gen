import java.util.*;
// . >
class Main{
	static Scanner in = new Scanner(System.in);

	public static void main(String args[]){	
		// String a = in.nextLine();
		int n = scInt(), k = scInt();
		int m = (n % 2 == 0) ? n / 2 : n / 2 + 1;
		int r = n / 2;
		// pl(m + " " + r);
		long res = ( (long)(Math.pow(k, m) ) * ( (long)Math.pow((k - 1), r) ) ); 
		pl( res + "");
		
	}

	public static int scInt(){return in.nextInt();}
	public static double scDbl(){return in.nextDouble();}
	public static String scStr(){return in.next();}
	public static String scLne(){return in.nextLine();}

	public static void pl(String s){System.out.println(s);}	

}
