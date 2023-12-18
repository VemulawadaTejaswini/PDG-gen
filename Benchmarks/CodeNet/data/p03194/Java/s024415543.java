import java.util.Scanner;
import java.lang.Math;
import java.util.ArrayList;
import java.util.List;

class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		long n = stdIn.nextInt();
		long p = stdIn.nextLong();
		long num = p;
		List<Integer> sosu = new ArrayList<Integer>();
		while (num % 2 == 0){
			num = num / 2;
			sosu.add(2);
		}
		p = num;
		for (int i = 3; i <= p; i+=2) {
			while (num % i == 0) {
				num = num / i;
				sosu.add(i);		
			}
		}
		int k = sosu.size();
		List<Integer> yousosu = new ArrayList<Integer>();
		List<Integer> youso = new ArrayList<Integer>();
		for (int i = 0; i < k;) {
			int l = sosu.get(i);
			int m = 1;
			youso.add(l);
			int j1 = 0;
			for (int j = 0; j < k; j++) {
				if (sosu.get(j) == l){
					m = m + 1;	
					j1 = j;
				}
			}
			yousosu.add(m);
			i = j1 + 1;
		}
		int y1 = youso.size();
		int answer = 1;
		for (int i = 0; i < y1; i++) {
			if (yousosu.get(i) >= n) {
				int y2 = youso.get(i);
				answer = answer * y2;
			}
		}
		System.out.println(answer);
	}
}