import java.util.*;
import java.awt.geom.*;

public class Main{
	
	class C implements Comparable<C>{
		int ind, value;

		public C(int ind, int value) {
			this.ind = ind;
			this.value = value;
		}

		@Override
		public int compareTo(C o) {
			return o.value - this.value;
		}
	}

	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			int m = sc.nextInt();
			if((n|m) == 0) break;
			int [][] data = new int[n][m];
			for(int i = 0; i < n; i++){
				for(int j = 0; j < m; j++){
					data[i][j] = sc.nextInt();
				}
			}
			int [] freq = new int[m];
			for(int i = 0; i < m; i++){
				for(int j = 0; j < n; j++){
					if(data[j][i] == 1) freq[i]++;
				}
			}
			C [] str = new C[m];
			for(int i = 0; i < m; i++){
				str[i] = new C(i + 1, freq[i]);
			}
			Arrays.sort(str);
			for(int i = 0; i < str.length - 1; i++){
				System.out.print(str[i].ind + " ");
			}
			System.out.println(str[m-1].ind);
		}
	}

	
	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}
}