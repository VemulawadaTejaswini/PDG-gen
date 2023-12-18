import java.util.*;
import java.util.function.*;
import java.math.*;
public class Main {
    public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int[][] a = new int[N][3];
		int[][] b = new int[N][3];
		for(int i = 0; i < N; i++) {
			a[i][0] = s.nextInt();
			a[i][1] = s.nextInt();
			a[i][2] = 1; 
		}
		for(int i = 0; i < N; i++) {
			b[i][0] = s.nextInt();
			b[i][1] = s.nextInt();
			b[i][2] = 1;
		}
		
		// a,b : 0=x, 1=y, 2=使用済みフラグ
		Arrays.sort(b, (x, y) -> Integer.compare(y[0], x[0]));
		
		int ret = 0;
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				if(b[i][0] > a[j][0] && b[i][1] > a[j][1]) {
					b[i][2]--;
					a[j][2]--;
					ret++;
					break;
				}
			}
		}
		System.out.println(ret);
    }
}