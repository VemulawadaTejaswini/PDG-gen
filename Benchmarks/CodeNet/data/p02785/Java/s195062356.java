import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),c = sc.nextInt();
		int[] x=new int[n];
		for(int i=0;i<n;i++)
			x[i] = sc.nextInt();
		Arrays.sort(x);
		long sum = 0;
		for(int i=0;i<n-c;i++)
			sum+=x[i];
		System.out.print(sum);
	}
}
