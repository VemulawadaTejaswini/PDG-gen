

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * AOj id=0068
 * Enclose Pins with a Rubber Band
 * @author scache
 *
 */
public class Main {
	public static void main(String[] args) {
		Main p = new Main();
	}

	public Main() {
		Scanner sc = new Scanner(System.in);
		sc.useDelimiter(",|\\s");
		while(true){
			int n = sc.nextInt();
			if(n==0)break;
			
			ArrayList<double[]> l = new ArrayList<double[]>(n);
			for(int i=0;i<n;i++){
				l.add(new double[]{sc.nextDouble(), sc.nextDouble()});
			}
			solve(n, l);	
		}
	}

	public void solve(int n, ArrayList<double[]> l) {
		Collections.sort(l, new DoubleArrayComparator());
		
		LinkedList<double[]> resu = new LinkedList<double[]>();
		resu.add(l.get(0));
		resu.add(l.get(1));
		
		for(int i=2;i<l.size();i++){
			resu.add(l.get(i));
			while(resu.size()>=3){
				int len = resu.size();
				double[] p1 = resu.get(len-3);
				double[] p2 = resu.get(len-2);
				double[] p3 = resu.get(len-1);
				
				double vx1 = p2[0]-p1[0];
				double vy1 = p2[1]-p1[1];
				double vx2 = p3[0]-p1[0];
				double vy2 = p3[1]-p1[1];
				
				if(vx1*vy2-vx2*vy1 < 0 )
					break;
				
				resu.remove(len-2);	
			}
		}
		
		LinkedList<double[]> resd = new LinkedList<double[]>();
		resd.add(l.get(l.size()-1));
		resd.add(l.get(l.size()-2));
		for(int i=l.size()-2;i>=0;i--){
			resd.add(l.get(i));
			while(resd.size()>=3){
				int len = resd.size();
				double[] p1 = resd.get(len-3);
				double[] p2 = resd.get(len-2);
				double[] p3 = resd.get(len-1);
				
				double vx1 = p2[0]-p1[0];
				double vy1 = p2[1]-p1[1];
				double vx2 = p3[0]-p1[0];
				double vy2 = p3[1]-p1[1];
				
				if(vx1*vy2-vx2*vy1 < 0 )
					break;
				
				resd.remove(len-2);	
			}
		}
		System.out.println(n-resu.size()-resd.size()+2);
		
		
	}

	public class DoubleArrayComparator implements Comparator<double[]>{
		@Override
		public int compare(double[] o1, double[] o2) {
			if(o1[0]==o2[0])
				return Double.compare(o1[1], o2[1]);
			else
				return Double.compare(o1[0], o2[0]);
		}
	}
	
}