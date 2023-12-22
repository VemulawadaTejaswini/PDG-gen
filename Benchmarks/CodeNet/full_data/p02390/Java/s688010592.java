import java.io.*;
import java.util.*;

public class Main {


	public static void solver() {
	
		int a = cin.nextInt();

		int h = (int)a/3600;
		
		int m= (int) a%3600 / 60;
		
		int s = (a % 3600) % 60;
		
		cout.printf("%d:%d:%d\n", h, m, s);
		
		
		

	}
		
	
	public static void main(String[] args) throws IOException {

		cin = new Scanner(System.in);
		
		Main.solver();
	}

	static Scanner     cin;
	static PrintStream cout = System.out;//標準出力
	
}