import java.awt.Point;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	
	static int n;
	
	static int[] arr;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		//BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		Scanner in = new Scanner(System.in);
		
		
		int n = in.nextInt();
		
		int e = in.nextInt();
		
		int[] to = new int[n];
		int[] exit = new int[n];

		for(int i=0; i<e; i++) {
			int x = in.nextInt()-1;
			int y = in.nextInt()-1;
			
			if(x == 1) {
				to[x] = 1;
			}
			
			if(y == n-1) {
				exit[x] = 1;
			}
		}
		
		for(int i=1; i<n-1; i++) {
			if(to[i] ==1 && exit[i] == 1) {
				System.out.println("POSSIBLE");
				return;
			}
		}
		
		System.out.println("IMPOSSIBLE");

		
		
	}
	
}

