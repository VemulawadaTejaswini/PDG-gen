import java.util.*;
import java.awt.geom.*;

public class Main{
	double EPS = 1.0e-08;
	TreeSet<Double> list;

	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int w = sc.nextInt();
			int h = sc.nextInt();
			int n = sc.nextInt();
			int [][] f = new int[n][3]; // {a,b,c}
			for(int i = 0; i < n; i++){
				int a = sc.nextInt();
				int p = sc.nextInt();
				int q = sc.nextInt();
				f[i][0] = a;
				f[i][1] = -2 * p * a;
				f[i][2] = p * p * a + q;
			}
			list = new TreeSet<Double>();
			for(int i = 0; i < n; i++){
				
				//yama yama
				for(int j = i + 1; j < n;j++){
					calcX(f[i], f[j]);
				}
				
				//yama mado
				double [] xWhenY0 = calcXByF(f[i][0], f[i][1], f[i][2]);
				for(int j = 0; j < xWhenY0.length; j++){
					list.add(xWhenY0[j]);
				}
				
				double [] xWhenYh = calcXByF(f[i][0], f[i][1], f[i][2] - h);
				for(int j = 0; j < xWhenYh.length; j++){
					list.add(xWhenYh[j]);
				}
			}
			list.add(0.0);
			list.add((double) w);
			ArrayList<Double> intersectionP = new ArrayList<Double>();
			
			for(double value: list){
				if(value < 0 || value > w){
				}
				else{
					intersectionP.add(value);
				}
			}
			
			double sum = 0;
			for(int i = 1; i < intersectionP.size(); i++){
				double rangeA = intersectionP.get(i-1);
				double rangeB = intersectionP.get(i);
				double rangeMid = (rangeA + rangeB) / 2;
				
				int ind = -1;
				double max = -1 * Integer.MIN_VALUE;
				for(int j = 0; j < n; j++){
					double nowY = calcFx(f[j], rangeMid);
					if(nowY > max){
						max = nowY;
						ind = j;
					}
				}
				
				if(max < 0 || max > h) continue;
				
				
				
				//simpson
				double nowsum = 0;
				//DAME
				//nowsum = ((rangeB - rangeA) / 6) * (calcF(f[ind], rangeA) + 4 * calcF(f[ind], rangeMid) + calcF(f[ind], rangeB));
				
				int separatesize = 10000;
				double deltaX = (rangeB - rangeA) / (2 * separatesize);
				nowsum = calcF(f[ind], rangeA) + 4.0 * calcF(f[ind], rangeA + deltaX) + calcF(f[ind], rangeB);
				
				for(int j = 1; j < separatesize; j++){
					nowsum += 2.0 * calcF(f[ind],rangeA + 2 * j * deltaX) + 
							4.0 * calcF(f[ind], rangeA + (2 * j + 1) * deltaX);
				}
				nowsum = deltaX * nowsum / 3.0;
				sum += nowsum;
			}
			System.out.printf("%.15f\n", sum);
		}
	}

	private double calcF(int[] f, double range) {
		double a = 2 * f[0] * range;
		double b = f[1];
		double sq = 1 + (a + b) * (a + b);
		return Math.sqrt(sq);
	}

	private void calcX(int [] f1, int [] f2) {
		int [] f3 = new int[3];
		for(int i = 0; i < 3; i++){
			f3[i] = f1[i] - f2[i];
		}
		double [] x = calcXByF(f3[0], f3[1], f3[2]);
		for(int i = 0; i < x.length; i++){
			list.add(x[i]);
		}
	}

	private double calcFx(int [] f, double resx) {
		double res = f[0] * resx * resx + f[1] * resx + f[2];
		return res;
	}

	private double[] calcXByF(int a, int b, int c) {
		if(a == 0){
			return new double[]{-1.0 * c / b};
		}
		
		int d = b * b - 4 * a * c;
		if(d < 0){
			return new double[]{};
		}
		else if(d == 0){
			return new double[]{(-1 * b) / (2 * a)};
		}
		else{
			double sqrt = Math.sqrt(d);
			double res1 = (-1 * b + sqrt) / (2 * a);
			double res2 = (-1 * b - sqrt) / (2 * a);
			return new double []{res1, res2};
		}
	}

	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}
}