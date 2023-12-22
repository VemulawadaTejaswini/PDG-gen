import java.util.*;
import static java.lang.System.*;

public class Main {

	Scanner sc = new Scanner(in);
	
	List<Integer> b = new ArrayList<Integer>();
	List<Integer> h = new ArrayList<Integer>();
	List<Double> tank = new ArrayList<Double>();
	List<Boolean> full = new ArrayList<Boolean>();
	
	void pour(int index, double amount) {
		
		//full
		if (Math.abs(amount - 30.0*b.get(index)*(Math.min(h.get(index), h.get(index+1))-tank.get(index))) < 1E-5) {
			tank.set(index, (double)Math.min(h.get(index), h.get(index+1)));
			full.set(index, true);
		}
		//not overflow
		else if (amount + 1E-5 <= 30.0*b.get(index)*(Math.min(h.get(index), h.get(index+1))-tank.get(index))) {
			tank.set(index, tank.get(index)+(double)amount/(30.0*b.get(index)));
		}
		//overflow
		else {
			int next;
			if (h.get(index) < h.get(index+1))
				next = index-1;
			else
				next = index+1;
			
			double t = tank.get(index);
			full.set(index, true);
			tank.set(index, (double)Math.min(h.get(index), h.get(index+1)));
			//next tank is not full
			if (next < full.size() && !full.get(next)) {
				pour(next, amount - 30.0*b.get(index)*(Math.min(h.get(index), h.get(index+1))-t));
			}
			//next tank is full
			else if(next < full.size() && full.get(next)){
				double temp = amount - 30.0*b.get(index)*(Math.min(h.get(index), h.get(index+1))-t);
				//flow left
				if (h.get(index) < h.get(index+1)) {
					h.remove(index);
					b.set(index-1, b.get(index-1)+b.get(index));
					b.remove(index);
					tank.remove(index);
					full.set(index-1, false);
					full.remove(index);
					pour(index-1, temp);
				} 
				//flow right
				else {
					h.remove(index+1);
					b.set(index, b.get(index)+b.get(index+1));
					b.remove(index+1);
					tank.remove(index+1);
					full.set(index, false);
					full.remove(index+1);
					pour(index, temp);
				}
					
			}
		}
	}
	
	
	void run() {
		int d = sc.nextInt();
		List<Integer> tb = new ArrayList<Integer>();
		List<Integer> th = new ArrayList<Integer>();
		List<Double> ttank = new ArrayList<Double>();
		List<Boolean> tfull = new ArrayList<Boolean>();
		
		for (int i = 0; i < d; i++) {
			int n = sc.nextInt();
			int[] _b = new int[n];
			tb.clear();
			th.clear();
			ttank.clear();
			tfull.clear();
			
			th.add(50);
			for (int j = 0; j < n ;j++) {
				_b[j] = sc.nextInt();
				th.add(sc.nextInt());
				ttank.add(0.0);
				tfull.add(false);
			}
			th.add(50);
			ttank.add(0.0);
			tfull.add(false);
			tb.add(_b[0]);
			for (int j = 1; j < n ;j++)
				tb.add(_b[j]-_b[j-1]);
			tb.add(100-_b[n-1]);
			
			int m = sc.nextInt();
			int[] f = new int[m];
			int[] a = new int[m];
			for (int j = 0; j < m; j++) {
				f[j] = sc.nextInt();
				a[j] = sc.nextInt();
			}
			
			
			
			int l = sc.nextInt();
			for (int j = 0; j < l; j++) {
				
				b.clear();
				for (int k : tb)
					b.add(k);
				h.clear();
				for (int k : th)
					h.add(k);
				tank.clear();
				for (double k : ttank)
					tank.add(k);
				full.clear();
				for (boolean k : tfull)
					full.add(k);
				
				int p = sc.nextInt(), t = sc.nextInt();
				for (int k = 0; k < m; k++) {
					int sum = 0, index = b.size()-1;
					for (int z = 0; z < b.size(); z++) {
						sum += b.get(z);
						if (f[k] < sum) {
							index = z;
							break;
						}
					}
					//pour water
					pour(index, (double)a[k]*t);
					
//					for (double g : tank)
//						out.println(g);
//					out.println();
				}
				
				int sum = 0, index = b.size()-1;
				for (int z = 0; z < b.size(); z++) {
					sum += b.get(z);
					if (p < sum) {
						index = z;
						break;
					}
				}
				out.println(tank.get(index));
//				out.print("\n");
			}
//			out.print("\n\n\n");
		}
		
	}
	
	public static void main(String[] args) {
		new Main().run();
	}

}