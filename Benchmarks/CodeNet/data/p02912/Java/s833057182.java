import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

	int n=sc.nextInt();
	int m=sc.nextInt();
	long a[]=new long[n];
	for(int i=0;i<n;i++){
		a[i]=sc.nextLong();
	}

	for(int i=1;i<=m;i++){
		Arrays.sort(a);
a[n-1]=a[n-1]/2;
	}
System.out.println(sum(a));
	}

	public static long sum(long a[]){
		long ans=0;
		for(int i=0;i<a.length;i++){
		ans+=a[i];
	}
	return ans;
}}