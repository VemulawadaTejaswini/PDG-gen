import java.io.PrintWriter;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		
		int N = sc.nextInt();
		int[] x = new int[N];
		int[] y = new int[N];
		boolean even = false;
		boolean odd = false;
		for(int i=0; i<N; i++) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
			if((x[i]+y[i]+100)%2==0)
				even = true;
			else
				odd = true;
		}
		
		if(even && odd) {
			pw.println(-1);
			pw.close();
			sc.close();
			return;
		}
		
		int[] v = null;
		if(even)
			v = new int[]{8,4,2,1,8,4,2,1,1,1};
		else
			v = new int[]{8,4,2,1,8,4,2,1,1};
		
		pw.println(v.length);
		for(int i : v)
			pw.println(i);
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<4; j++) {
				if(x[i]>0) {
					pw.print('R');
					x[i] -= v[j];
				} else {
					pw.print('L');
					x[i] += v[j];
				}
			}
			for(int j=4; j<8; j++) {
				if(y[i]>0) {
					pw.print('U');
					y[i] -= v[j];
				} else {
					pw.print('D');
					y[i] += v[j];
				}
			}
			for(int j=8; j<v.length; j++) {
				if(y[i]>0) {
					pw.print('U');
					y[i] -= v[j];
				} else if(y[i]<0){
					pw.print('D');
					y[i] += v[j];
				} else if(x[i]>0) {
					pw.print('R');
					x[i] -= v[j];
				} else{
					pw.print('L');
					x[i] += v[j];
				}
			}
			pw.println('\n');
		}
		
		pw.close();
		sc.close();

	}
	
}
