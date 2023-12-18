import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];

		boolean allnegs = true;
		boolean allposs = true;

		int min = 0;
		int max = 0;
		for(int i = 0; i < n; ++i) {
			arr[i] = in.nextInt();

			if(arr[i] < 0)
				allposs = false;
			else if(arr[i] >= 0)
				allnegs = false;

			if(arr[min] > arr[i])
				min = i;
			if(arr[max] < arr[i])
				max = i;
		}



		ArrayList<Pair> li = new ArrayList();
		if(allnegs) {
			for(int i = n - 1; i > 0; --i) {
				li.add(new Pair(i , i - 1));
			}
		} else if(allposs) {
			for(int i = 1; i < n; ++i) {
				li.add(new Pair(i , i - 1));
			}
		} else {
			if(Math.abs(arr[min]) <= arr[max]) {
				for(int i = 0; i < n; ++i) 
					if(i != max)
						li.add(new Pair(max, i));
				for(int i = 1; i < n; ++i) {
					li.add(new Pair(i , i - 1));
				}
			} else {
				for(int i = 0; i < n; ++i) 
					if(i != min)
						li.add(new Pair(min, i));

				for(int i = n - 1; i > 0; --i) {
					li.add(new Pair(i , i - 1));
				}
			}
		}

		System.out.println(li.size());
		for(Pair p : li) {
			System.out.println(p);
		}
	}

	private static class Pair {
		int f, s;

		public Pair(int f, int s) {
			this.f = f;
			this.s = s;
		}

		@Override
		public String toString() {
			return (f+1)+" "+(s+1);
		}
	}

}
