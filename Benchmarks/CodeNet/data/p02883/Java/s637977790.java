import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int [] a = new int [n];
		int [] f = new int [n];
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		for(int i = 0; i < n; i++) {
			f[i] = sc.nextInt();
		}

		Queue<Combination> queue = new PriorityQueue<>();
		Arrays.sort(a);
		Arrays.sort(f);
		for(int i = 0; i < n; i++) {
			queue.add(new Combination(a[i], f[f.length-1-i]));
		}


		for(int i = 0; i < k; i++) {
			Combination tmp = queue.poll();
			if(tmp.getSq() <= 0) {
				System.out.println(0);
				System.exit(0);
			}
			tmp.reduceA();
			queue.add(tmp);
		}
		long ans = queue.poll().getSq();
		System.out.println(ans);
	}
}

class Combination implements Comparable<Combination> {
	private long a;
	private long f;

	public Combination(int a, int f){
		this.a = a;
		this.f = f;
	}

	public int compareTo(Combination another) {
		if(another.getSq() - getSq() > 0) {
			return 1;
		} else if(another.getSq() - getSq() == 0 ){
			return 0;
		} else {
			return -1;
		}
	}

	public long getSq() {
		return a * f;
	}

	public void reduceA() {
		a--;
	}
}