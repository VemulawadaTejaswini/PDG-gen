
import java.util.*;
import java.io.*;

import static java.util.Arrays.*;
import static java.lang.Math.*;

public class Main {
	
	int MAX = 1000 * 1000;
	boolean[] ip = new boolean[MAX+1];
	
	void run() {
		Scanner sc = new Scanner(System.in);
		ip[0] = ip[1] = true;
		for (int i = 2; i <= MAX; i++) if(!ip[i]) {
			for(int j=2*i; j<=MAX;j+=i) ip[j] = true;
		}
		
		for(;;) {
			int a = sc.nextInt();
			int d = sc.nextInt();
			int n = sc.nextInt();
			
			if( (a|d|n) == 0) break;
			
			int i=0, j=0;
			for(i=0;j<n;i++) {
				if(!ip[i*d+a])j++;
			}
			i--;
			System.out.println((i*d+a));
			
			
		}
	}
	
	public static void main(String[] args) {
		try {
			System.setIn(new FileInputStream("A.in"));
			System.setOut(new PrintStream( new FileOutputStream("A.out") ) );
		} catch (Exception e) {
			
		}
		
		new Main().run();
	}
}