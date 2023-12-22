import java.awt.geom.*;
import java.io.*;
import java.util.*;

public class Main{
	double EPS = 1.0e-08;
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			if(n == 0) break;
			int [][] data = new int[n][3];
			for(int i = 0; i < n; i++){
				for(int j = 0; j < 3; j++){
					data[i][j] = sc.nextInt();
				}
			}
			
			double best = 1 << 24;
			int ind = -1;
			for(int i = 0; i < n; i++){
				double now = 22.0 - ((double)(data[i][2]) / (data[i][1] * 0.01 * data[i][1] * 0.01));
				now = Math.abs(now);
				if(best > now){
					best = now;
					ind = i;
				}
			}
			System.out.println(data[ind][0]);
		}
	}
	
	private void debug(Object... o) { System.out.println("debug = " + Arrays.deepToString(o)); }

	public static void main(String[] args) {
		new Main().doit();
	}
}