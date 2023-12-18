import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Main main = new Main();
		People[] people = new People[N];
		for (int i = 0; i < N; i++) {
			People p = main.new People();
			p.a = sc.nextInt();
			p.b = sc.nextInt();
			people[i] = p;
		}
		Arrays.parallelSort(people);
		int count =0;
		count +=people[0].a-1;
		count +=people[N-1].b+people[N-1].a;
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