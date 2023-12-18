import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		long A[] = new long[N];
		for (int i=0;i<N;i++) {
			A[i] = sc.nextLong();
		}
		Arrays.sort(A);
		B b[] = new B[M];
		Main main = new Main();
		for (int i=0;i<M;i++) {
			int count= sc.nextInt();
			long number = sc.nextLong();
			B tempB = main.new B();
			tempB.count = count;
			tempB.number = number;
			b[i] = tempB;
		}
		Arrays.sort(b);
		int count =0;
		long sum =0;
		int tempA = A.length-1;
		int tempB = b.length-1;
		while (count<N) {
			if (tempB<0||A[tempA]>b[tempB].number) {
				count ++;
				sum +=A[tempA];
				tempA--;
			} else {
				if (count+b[tempB].count<=N) {
					count+=b[tempB].count;
					sum  += b[tempB].number*b[tempB].count;
				} else {
					sum +=b[tempB].number*(N-count);
					count =N;
				}
				tempB--;
			}
		}
		System.out.println(sum);
	}

	public class B implements Comparable{
		public int count ;
		public long  number;
		@Override
		public int compareTo(Object o) {
			B b= (B)o;
			if (this.number>b.number)
				return 1;
			else if (this.number==b.number) {
				return 0;
			}
			return -1;
		}
	}
}