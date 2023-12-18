import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();

		class DoubleInteger implements Comparable<DoubleInteger>{

			long a;
			long b;

			public int compareTo(DoubleInteger ab) {return ab.a<this.a ? 1 : ab.a==this.a ? 0 : -1;}

			public DoubleInteger(long a, long b) {
				this.a=a;
				this.b=b;
			}

		}

		List<DoubleInteger> AB = new ArrayList<>();

		for(int i=0;i<N;i++) {

			long a =sc.nextInt();
			long b =sc.nextInt();
			AB.add(new DoubleInteger(a,b));

		}

		Collections.sort(AB);

		long result = 0;
		int i = 0;
		for(;M>0;i++) {
			result += AB.get(i).a * AB.get(i).b;
			M -= AB.get(i).b;
		}
		i--;

		result -= Math.abs(M) * AB.get(i).a;
		System.out.println(result);

	}

}