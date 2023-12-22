import java.util.*;
import java.awt.geom.*;

public class Main{
	double EPS = 1.0e-08;

	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			int [][] data = new int[2][2];
			for(int i = 0; i < 2; i++){
				for(int j = 0; j < 2; j++){
					data[i][j] = sc.nextInt()-1;
				}
			}
			int min = 1 << 24;
			for(int i = 1; i <= n; i++){
				
				int sum = 0;
				for(int j = 0; j < 2; j++){
					int pos1 = data[j][0];
					int x1 = pos1 % i;
					int y1 = pos1 / i;
					int pos2 = data[j][1];
					int x2 = pos2 % i;
					int y2 = pos2 / i;
					sum += Math.abs(x1 - x2) + Math.abs(y1 - y2);
				}
				min = Math.min(min, sum);
			}
			System.out.println(min);
		}
	}
	
	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}
}