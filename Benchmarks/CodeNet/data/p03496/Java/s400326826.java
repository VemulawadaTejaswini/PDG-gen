import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; ++i) {
			arr[i] = in.nextInt();
		}

		ArrayList<Pair> li = new ArrayList();
		int min = 0;
		boolean flag = false;
		for(int i = 1; i < n; ++i) {
			if(arr[i] < arr[i - 1]) {
				if(arr[i-1] <= 0) {
					min = i;
					flag = true;
				} else {
					while(arr[i] < arr[i-1]){
						li.add(new Pair(i-1, i));
						arr[i] += arr[i - 1];
					}
				}
			}
		}

		for(int j = 0; j < min; ++j)
			li.add(new Pair(min, j));

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
