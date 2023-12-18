import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int T = in.nextInt();
		int A = in.nextInt();
		int h[] =new int[N];
		double t[] =new double[N];
		for (int i = 0; i < N; i++) {
			h[i]= in.nextInt();
			t[i]=T-h[i]*0.006;
		}
		int minn=10000;
		double min=10000000;
		for (int i = 0; i < N; i++) {
			if(min>Math.abs(t[i]-A)) {
				min=t[i];
				minn=i;
			}
		}
		System.out.println(minn+1);
	}
}
