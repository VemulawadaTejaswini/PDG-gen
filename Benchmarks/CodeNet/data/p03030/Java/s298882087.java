import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Main main = new Main();
		Restanrant[] re = new Restanrant[N];
		for (int i=0;i<N;i++) {
			Restanrant r = main.new Restanrant();
			r.S = sc.next();
			r.P = sc.nextInt();
			r.num = i+1;
			re[i] =r;
		}
		Arrays.sort(re);
		for(int i=0;i<N;i++) {
			System.out.println(re[i].num);
		}
	}

	public class Restanrant  implements Comparable<Restanrant> {
		String S ;
		int P;
		int num;
		@Override
		public int compareTo(Restanrant o) {
			if (this.S.equals(o.S)==false) {
				return this.S.compareTo(o.S);
			}
			if (this.P<o.P) {
				return 1;
			}
			if (this.P>o.P) {
				return -1;
			}
			return 0;
		}

	}
}