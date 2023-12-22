import java.util.Scanner;
public class Main {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		long A[]=new long[N];
		long B[]=new long[100000];
		for(int i=0;i<N;i++) {
			A[i]=sc.nextLong();
			if(i-A[i]>=0)
			B[(int) (i-A[i])]++;
		}
		long ans=0;
		for(int i=0;i<N;i++) {
			ans+=B[(int) (i+A[i])];
			if(i-A[i]>=0)
				B[(int) (i-A[i])]--;
		}
		System.out.println(ans);
}
}
