import java.util.Scanner;
 
public class Main {

	public static final MyScanner in = new MyScanner();

	public static void main(String[] args) {

		String Sunny = "Sunny";
		String Cloudy = "Cloudy";
		String Rainy = "Rainy";

		String i = in.next();

		System.out.println(Sunny.equals(i) ? Cloudy :
			               Cloudy.equals(i) ? Rainy :
			               Rainy.equals(i) ? Sunny : "");

	}

	public static class MyScanner{
		Scanner sc = new Scanner(System.in);
		String nextLine() {return sc.nextLine();}
		String next() {return sc.next();}
		int nextInt() {return Integer.valueOf(sc.next());}
	}

}