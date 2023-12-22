import java.util.*;
class Main {
	public static void main(String[] a) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long sum=0;
		for(long i=1;i<=n;i++) {
			sum+=((n/i)*i+i)*(n/i)/2;
		}
		System.out.println(sum);
	}
}

