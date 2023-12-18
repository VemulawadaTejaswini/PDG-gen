import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int count =0;
		for (int i=0;i<N;i++) {
			int l = sc.nextInt();
			int r = sc.nextInt();
			count +=r-l+1;
		}
		System.out.println(count);
	}

	public class People implements Comparable<People> {
		int a;
		int b;
		@Override
		public int compareTo(People o) {
			return this.a - o.a;
		}

	}
}