import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
	
	public static class Rec implements Comparable<Rec> {
		double start, end;
		double max, min;
		
		public Rec(double start, double end, double max, double min) {
			super();
			this.start = start;
			this.end = end;
			this.max = max;
			this.min = min;
		}

		@Override
		public int compareTo(Rec arg0) {
			return this.start - arg0.start < 0 ? -1 :
					this.start - arg0.start > 0 ? 1 : 0;
		}
	}

	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		
		int count = 1;
		while (true) {
			final int n = sc.nextInt();
			
			if(n == 0){
				break;
			}
			
			ArrayList<Rec> walls = new ArrayList<Rec>(n);
			TreeSet<Double> set = new TreeSet<Double>();
			
			for(int i = 0; i < n; i++){
				final double x = sc.nextDouble();
				final double y = sc.nextDouble();
				final double r = sc.nextDouble();
				
				set.add(x - r);
				set.add(x + r);
				walls.add(new Rec(x - r, x + r, y + r, y - r));
			}
			
			Collections.sort(walls);
			ArrayList<Double> list = new ArrayList<Double>(set);
			
			double min[] = new double[list.size()];
			Arrays.fill(min, Double.MAX_VALUE);
			double max[] = new double[list.size()];
			
			
			for(Rec r : walls){
				
				final int start = Collections.binarySearch(list, r.start);
				final int end = Collections.binarySearch(list, r.end);
				
				for(int i = start; i < end; i++){
					max[i] = Math.max(max[i], r.max);
					min[i] = Math.min(min[i], r.min);
				}
			}
			/*
			for(int i = 0; i < list.size(); i++){
				System.out.println(i + "("+ list.get(i) +")" + ": min = " + min[i] + " , max = " + max[i]);
			}
			*/
			double sum = 0;
			for(int i = 0; i < list.size() - 1; i++){
				sum += (max[i] - min[i]) * (list.get(i + 1) - list.get(i));
			}
			
			System.out.println(count + " " + sum);
			count++;
		}
	}

}