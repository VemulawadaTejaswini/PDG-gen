import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	static ArrayList<Integer> cities = new ArrayList<>();
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int N = Integer.parseInt(sc.next());
		int K = Integer.parseInt(sc.next());
		int[] x = new int[N];
		int[] y = new int[N];
		HashMap<Integer,Integer> x_y = new HashMap<>();
		HashMap<Integer,Integer> y_x = new HashMap<>();
		
	for(int i=0;i<N;i++) {
		x[i] = Integer.parseInt(sc.next());
		y[i] = Integer.parseInt(sc.next());
		x_y.put(x[i], y[i]);
		y_x.put(y[i],x[i]);
	}
	Arrays.sort(x);
	Arrays.sort(y);
	long result = Long.MAX_VALUE;
	if(N==K) {
		result = (x[N-1]-x[0]) * (y[N-1]-y[0]);
	}
	for(int i=0;i<=N-K;i++) {
		long delta_x = x[i+K-1]-x[i];
		int y_max = Integer.MIN_VALUE;
		int y_min = Integer.MAX_VALUE;
		for(int j=i;j<i+K;j++) {
			y_max = Math.max(y_max, x_y.get(x[j]));
			y_min = Math.min(y_min, x_y.get(x[j]));
		}
		long delta_y = y_max-y_min;
		
		if(delta_x*delta_y>0) result = Math.min(result, delta_x*delta_y);
	}
	for(int i=0;i<=N-K;i++) {
		long delta_y = y[i+K-1]-y[i];
		int x_max = Integer.MIN_VALUE;
		int x_min = Integer.MAX_VALUE;
		for(int j=i;j<i+K;j++) {
			x_max = Math.max(x_max, y_x.get(y[j]));
			x_min = Math.min(x_min, y_x.get(y[j]));
		}
		long delta_x = x_max-x_min;
		
		if(delta_x*delta_y>0) result = Math.min(result, delta_x*delta_y);
	}
	
	
	out.println(result);

		out.flush();
	}


}

