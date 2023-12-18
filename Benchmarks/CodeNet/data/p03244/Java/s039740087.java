import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

class Pair implements Comparable<Pair>{
	int i, num;
	public Pair(int _i, int n) {
		i = _i; num = n;
	}
	public int compareTo(Pair p) {
		if(p.num == num) return i - p.i;
		return p.num - num;
	}
}

class Main{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		int[] left = new int[n / 2];
		int[] right = new int[n / 2];
		for(int i = 0; i < n; i++) {
			int a = sc.nextInt();
			if(i % 2 == 0) left[i / 2] = a;
			else right[i / 2] = a;
		}
		Arrays.sort(left);
		Arrays.sort(right);
		TreeSet<Pair> left_set = new TreeSet<Pair>();
		TreeSet<Pair> right_set = new TreeSet<Pair>();

		for(int i = 0; i < left.length; i++) {
			int tmp = i;
			while(i + 1 < left.length && left[i] == left[i + 1]) i++;
			left_set.add(new Pair(left[i], i - tmp + 1));
		}
		for(int i = 0; i < right.length; i++) {
			int tmp = i;
			while(i + 1 < right.length && right[i] == right[i + 1]) i++;
			right_set.add(new Pair(right[i],  i - tmp + 1));
		}
		Pair left_first = left_set.pollFirst(), left_second = left_set.pollFirst();
		Pair right_first = right_set.pollFirst(), right_second = right_set.pollFirst();

		if(left_first.i != right_first.i) {
			System.out.println(n - left_first.num - right_first.num);
		}else {
			/* left: first, right: second */
			int fs = n / 2 - left_first.num + n / 2 - ((right_second == null) ? 0 : right_second.num);

			/* right: first, left: second */
			int sf = n / 2 - right_first.num + n / 2 - ((left_second == null) ? 0 : left_second.num);

			System.out.println(Math.min(fs, sf));
		}
	}
}