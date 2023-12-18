
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();
		int e=sc.nextInt();
		int f=sc.nextInt();

		long ans1 = 0;
		long ans2 = 0;
		double ans3 = 0;
		for(int i=0; 100*a*i<=f; i++) {
			for(int j=0; 100*b*j<=f; j++) {
				int w = 100*a*i+100*b*j;
				if(w==0) continue;
				if(w>f) continue;
				for(int k=0; c*k<=f; k++) {
					for(int l=0; d*l<=f; l++) {
						int s = c*k+d*l;
						if(s+w>f) continue;

						if(100.0*s/w>e) continue;
						double tmp = 100.0*s/(s+w);
						if(tmp>ans3) {
							ans1=s;
							ans2=w+s;
							ans3=tmp;
						}
					}
				}
			}
		}
		System.out.println(ans2+" "+ans1);
		sc.close();
	}

}
