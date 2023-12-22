import java.util.*;
import java.awt.geom.*;

public class Main{
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt() * 2;
			int m = sc.nextInt();
			int [][] table = new int[2][n];
			for(int i = 0; i < n; i++){
				table[0][i] = i + 1;
			}
			for(int i = 0; i < m; i++){
				int k = sc.nextInt();
				if(k == 0){
					for(int j = 0; j < n / 2; j++){
						table[(i+1) % 2][j * 2] = table[i % 2][j];
						table[(i+1) % 2][j * 2 + 1] = table[i % 2][j + n / 2];
					}
				}
				else{
					for(int j = 0; j < n; j++){
						int ind = (k + j) % n;
						table[(i+1) % 2][j] = table[i%2][ind];
					}
				}
			}
			for(int i = 0; i < n; i++){
				System.out.println(table[m % 2][i]);
			}
		}
	}

	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}
}