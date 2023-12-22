import java.io.*;
import java.util.*;

public class Main {

	public static void solver() {
	
		int a = cin.nextInt();
		int b = cin.nextInt();
		int c = cin.nextInt();
		int cnt = 0;
		
		for (int i=a; i<=b; i++) {
			
			if (c%i==0) cnt++;
			
		}
		
		cout.println(cnt);
		
	}
	
	public static void main(String[] args) throws IOException {

		cin = new Scanner(System.in);
		Main.solver();
	}

	static Scanner     cin;
	static PrintStream cout = System.out;//標準出力
}