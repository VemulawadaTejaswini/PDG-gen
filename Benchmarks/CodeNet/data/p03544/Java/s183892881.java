import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int N=sc.nextInt();
		long[] L=new long[N+1];
		int i;
		L[0]=2;
		L[1]=1;
		for(i=2;i<=N;i++) {
			L[i]=L[i-2]+L[i-1];
		}
		System.out.println(L[N]);
	}
}