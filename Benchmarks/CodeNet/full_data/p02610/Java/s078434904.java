import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int N = sc.nextInt();
			Main main = new Main();
			List<Number> a = new ArrayList<Number>();
			List<Number> b = new ArrayList<Number>();
			for (int j = 0; j < N; j++) {
				Number temp = main.new Number();
				temp.K = sc.nextInt();
				temp.L = sc.nextLong();
				temp.R = sc.nextLong();
				temp.sa = Math.abs(temp.L - temp.R);
				if (temp.L > temp.R) {
					temp.b = true;
					a.add(temp);
				} else {
					temp.b = false;
					b.add(temp);
				}
			}
			Collections.sort(a);
			Collections.sort(b);
			long sum = 0;
			int t[] = new int[N + 1];
			int nowmax = a.size();
			int nowmin = 0;
			for (int j = a.size()-1; j >=0 ; j--) {
				Number temp = a.get(j);
				int k = temp.K;
				if (k>nowmax) {
					k = nowmax;
				}
				sum +=temp.R;
				for (; k > nowmin; k--) {
					if (t[k] == 0) {
						if (nowmax==k) {
							nowmax--;
						} else if (nowmin+1==k) {
							nowmin++;
						}
						t[k] = 1;
						sum += temp.sa;
						break;
					}
				}
			}
			nowmin = b.size()+1;
			nowmax = N;
			for (int j = b.size()-1; j >=0 ; j--) {
				Number temp = b.get(j);
				int k = temp.K + 1;
				if (k< nowmin) {
					k = nowmin;
				}
				sum +=temp.L;
				for (; k <= nowmax; k++) {
					if (t[k] == 0) {
						if (nowmin==k) {
							nowmin++;
						} else if (nowmax==k) {
							nowmax--;
						}
						t[k] = 1;
						sum += temp.sa;
						break;
					}
				}
			}
			System.out.println(sum);
		}
	}

	public class Number implements Comparable<Number> {
		int K;
		long L;
		long R;
		long sa;
		boolean b;

		@Override
		public int compareTo(Number o) {
			if (this.sa > o.sa) {
				return 1;
			} else if (this.sa == o.sa ) {
				return 0;
			}
			return -1;
		}
	}
}