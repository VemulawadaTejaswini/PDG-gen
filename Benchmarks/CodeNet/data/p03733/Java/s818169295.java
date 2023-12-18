import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		int N=stdIn.nextInt();
		int T=stdIn.nextInt();
		int t[]=new int[N];
		long sum=0;
		int z=0;
		while(z<N) {
			t[z]=stdIn.nextInt();
			z++;
		}z=1;
		while(z<N) {
			if(t[z]-t[z-1]<T)
				sum+=t[z]-t[z-1];
			else
				sum+=T;
			z++;
		}
		sum+=T;
		System.out.println(sum);
	}
}