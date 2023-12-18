import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)) {

			int n = sc.nextInt();
			int m = sc.nextInt();

			int[] aArray = new int[n];
			int[] bArray = new int[n];
			Pair[] pArray = new Pair[n];

			for(int i = 0 ; i < n ; i++ ) {
				aArray[i] = sc.nextInt();
				bArray[i] = sc.nextInt();
				Pair p = new Pair();
				p.a = aArray[i];
				p.b = bArray[i];
				pArray[i] = p;
			}

			//
//			Arrays.stream(pArray).forEach(p -> System.out.println("## (" + p.a  + "," + p.b + ")"));

			//backward
			//rev_m = 0 to M-1 find max(a) where b <= rev_m
			//1,2,3,4,5
			//5,4,3,2,1

			Arrays.sort(pArray, new Comparator<Pair>() {

				@Override
				public int compare(Pair o1, Pair o2) {
					return Integer.compare(o1.a, o2.a);
				}
			});

//			Arrays.stream(pArray).forEach(p -> System.out.println("## (" + p.a  + "," + p.b + ")"));

			PriorityQueue<Pair> pq = new PriorityQueue<>(
					new Comparator<Pair>() {
						@Override
						public int compare(Pair o1, Pair o2) {
							return Integer.compare(o2.b, o1.b);
						}
					});
			
			int po = 0;
			long sum = 0;
			for(int revm = 1 ; revm <= m ; revm++ ) {
				while(po < pArray.length && pArray[po].a <= revm ) {
//					System.out.println("add " + pArray[po].a + "," + pArray[po].b);
					pq.add(pArray[po]);
					po++;
				}
				//get largest
				Pair max = pq.poll();
				if ( max != null ) {
					sum += max.b;
				}
			}
			
			System.out.println(sum);

		}
	}

	public static class Pair {
		public int a;
		public int b;
	}
}