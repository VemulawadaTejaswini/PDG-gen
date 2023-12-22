import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static String line;
	public static void main(String[] args) {
		read();
		slove();

	}
	static boolean read(){
		line = sc.nextLine();
		return true;
	}
	static void slove(){
		String Upperline = line.toUpperCase();
		System.out.println(Upperline);
	}
}