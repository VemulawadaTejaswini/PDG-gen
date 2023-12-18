import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		long []a=new long[3*N];
		long ans=0;
		for(int i=0;i<3*N;i++){
			a[i]=sc.nextLong();
		}
		Arrays.sort(a);
		for(int i=N;i<2*N;i++){
			ans+=a[i];
		}
		System.out.println(ans);
	}

}
