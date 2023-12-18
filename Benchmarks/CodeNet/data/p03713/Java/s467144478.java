import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int h=sc.nextInt();
		int w=sc.nextInt();
		long ans=Long.MAX_VALUE;
		for(int j=0; j<2; j++) {
			if(j==1) {
				int tmp=h;
				h=w;
				w=tmp;
			}
			if(h<3) continue;
			for(int i=1; i<h-1; i++) {
				long tmp1=0;
				long tmp2=0;
				long h1;
				long h2;
				long h3;
				long w1;
				long w2;
				long w3;
				//よこきる
				h1=i;
				h2=(h-h1)/2;
				h3=h-h1-h2;
				w1=w2=w3=w;
				tmp1 = Math.max(Math.max(h1*w1, h2*w2), h3*w3) - Math.min(Math.min(h1*w1, h2*w2), h3*w3);

				//たてきる
				h1=i;
				h2=h3=h-h1;
				w1=w;
				w2=w-(w/2);
				w3=w-w2;
				tmp2 = Math.max(Math.max(h1*w1, h2*w2), h3*w3) - Math.min(Math.min(h1*w1, h2*w2), h3*w3);
				ans = Math.min(ans, Math.min(tmp1, tmp2));
			}
		}
		System.out.println(ans);
		sc.close();
	}
}


