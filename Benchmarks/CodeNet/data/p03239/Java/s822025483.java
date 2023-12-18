import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int T = in.nextInt();
		int x[]=new int[1001];
		
		for(int i=0;i<1001;i++) {
			x[i]=10000;
		}
		
		
		for(int i=0;i<N;i++) {
			int a=in.nextInt();
			x[a]=in.nextInt();
		}
		int min=10000;
		int minnb=10000;
		
		for(int i=1;i<1001;i++) {
			if(x[i]<=T) {
				minnb=Math.min(minnb, i);
			}
		}
		
		if(minnb==10000) {
			System.out.println("TLE");
		}else {
			System.out.println(minnb);
		}
		

	}
}