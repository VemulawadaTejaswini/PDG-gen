import java.awt.geom.*;
import java.io.*;
import java.util.*;

public class Main{
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			long n = sc.nextInt();
			if(n == 0) break;
			int res = solve(n);
			System.out.println(res);
		}
	}

	private int solve(long n) {
		int count = 0;
		while(n != 1){
			if(n % 2 == 0){
				n = n / 2;
			}
			else{
				n = 3 * n + 1;
			}
			count++;
		}
		return count;
	}

	private void debug(Object... o) { System.out.println("debug = " + Arrays.deepToString(o)); }

	public static void main(String[] args) {
		new Main().doit();
	}
}