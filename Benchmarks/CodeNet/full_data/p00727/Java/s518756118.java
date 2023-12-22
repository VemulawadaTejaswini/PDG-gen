import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;

import static java.lang.Math.*;

public class Main{

	int N;
	final double diameter = 2.0;
	double[] eventline;
	Point[] ps;

	void run(){
		Scanner in = new Scanner(System.in);
		eventline = findThreshold();
		for(;;){
			N = in.nextInt();
			if(N==0) return ;
			ps = new Point[N];
			for(int i=0; i<N; i++){
				double x = in.nextDouble(), y = in.nextDouble();
				ps[i] = new Point(x,y);
			}
			solve();
		}
	}

	boolean inRange(double theta){
		return 0<=theta && theta<=PI;
	}

	double toRange(double theta){
		if(inRange(theta)){
			return theta;
		}
		else if(inRange(theta + PI)){
			return theta + PI;
		}
		else if(inRange(theta - PI)){
			return theta - PI;
		}
		return 0.0;
	}

	double[] findThreshold(){
		HashSet<Double> threshold = new HashSet<Double>();
		threshold.add(0.0);
		threshold.add(PI/2);
		threshold.add(PI);
		for(int i=1; i<=150; i++){
			for(int j=1; j<=150; j++){
				threshold.add(toRange(atan2(i,j)));
				threshold.add(toRange(atan2(-i,j)));
				threshold.add(toRange(acos(i/j)));
				threshold.add(toRange(acos(-i/j)));
				threshold.add(toRange(asin(i/j)));
				threshold.add(toRange(asin(-i/j)));
			}
		}
		Double[] tmp = threshold.toArray(new Double[0]);
		double[] tmpThreshold = new double[tmp.length];
		for(int i=0; i<tmp.length; i++){
			tmpThreshold[i] = tmp[i];
		}
		Arrays.sort(tmpThreshold);
		return tmpThreshold;
	}

	double calc(double theta){
		double[] xs = new double[N];
		for(int i=0; i<N; i++){
			xs[i] = ps[i].x*sin(theta) + ps[i].y*cos(theta);
		}
		return rangeMerge(xs);
	}

	double rangeMerge(double[] xs){
		Arrays.sort(xs);
		double ret = diameter;
		for(int i=0; i<N-1; i++){
			ret += diameter - max(0.0, (xs[i] + diameter) - xs[i+1]);
		}
		return ret;
	}

	void solve(){
		double minValue = Double.MAX_VALUE, maxValue = -Double.MAX_VALUE;
		double minAns = -1, maxAns = -1;
		for(double th:eventline){
			double result = calc(th);
			if(result > maxValue){
				maxValue = result;
				maxAns = th;
			}
			if(result < minValue){
				minValue = result;
				minAns = th;
			}
		}
		System.out.printf("%.12f\n", minAns);
		System.out.printf("%.12f\n", maxAns);
	}

	class Point{
		double x, y;
		Point(double _x, double _y){
			this.x = _x; this.y = _y;
		}
	}

	class Pair{
		double value;
		int index;
		Pair(double v, int i){
			this.value = v;
			this.index = i;
		}
	}

	class Cmp implements Comparator<Pair>{
		public int compare(Pair a, Pair b){
			double dif = a.value - b.value;
			return dif>0?1:dif<0?-1:0;
		}
	}

	public static void main(String args[]){
		new Main().run();
	}
}