import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		long N = scan.nextLong();
		long x = scan.nextLong();
		long a[] = new long[(int)N+1];
		for(int i=1;i<N+1;i++){
			a[i] = scan.nextLong();
		}

		int count = 0;

		for(int i=1;i<N;i++){
			long sum = a[i]+a[i+1];
			if(sum>x){
				long eat = sum-x;
				count += eat;
				a[i+1] -= eat;
			}
		}

		System.out.println(count);

		scan.close();
	}
}
