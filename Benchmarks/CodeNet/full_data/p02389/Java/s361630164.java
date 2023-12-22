import java.io.*;
import java.util.*;

public class Main {


	public static void solver() {
	
		int a = cin.nextInt();
		int b = cin.nextInt();
		
		cout.printf("%d %d\n", a*b, 2*(a+b));

	}	
	
	public static void main(String[] args) throws IOException {

		cin = new Scanner(System.in);
		Main.solver();
	}
		
	static Scanner     cin;
	static PrintStream cout = System.out;//標準出力
	
}