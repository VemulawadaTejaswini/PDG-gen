import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int v[] = new int[n];
		Main main = new Main();
		Count[] countA = new Count[100001];
		Count[] countB = new Count[100001];
		for (int i=0;i<100001;i++) {
			Count c = main.new Count();
			c.num=i;
			countA[i] =c ;
		}
		for (int i=0;i<100001;i++) {
			Count c = main.new Count();
			c.num=i;
			countB[i] =c ;
		}
		for (int i=0;i<n;i++) {
			v[i]= sc.nextInt();
			if (i%2==0) {
				countA[v[i]].count++;
			} else {
				countB[v[i]].count++;
			}
		}
		Arrays.sort(countA);
		Arrays.sort(countB);
		if (countA[0].num!=countB[0].num) {
			System.out.println((n/2-countA[0].count)+(n/2-countB[0].count));
		} else {
			int min = (n/2-countA[0].count)+(n/2-countB[1].count);
			if ((n/2-countA[1].count)+(n/2-countB[0].count)<min) {
				System.out.println((n/2-countA[1].count)+(n/2-countB[0].count));
			} else {
				System.out.println(min);
			}
		}
	}
	public class Count implements Comparable<Count> {
		int num;
		int count;
		@Override
		public int compareTo(Count o) {
			return o.count-this.count;
		}

	}
}