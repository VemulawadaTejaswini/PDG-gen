import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int X = in.nextInt();
		int x[]=new int[N];
		int c[]=new int[N];
		int key=0;
		int min=2147483640;
		for(int i=0;i<N;i++) {
			x[i]=in.nextInt();
			c[i]=x[i]-X;
		}		
		
		for(int i=0;i<N;i++) {
			min=Math.abs(Math.min(min, c[i]));
		}
		
		System.out.println(min);

	}
}