
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int h=sc.nextInt();
		int w=sc.nextInt();

		long ans = Long.MAX_VALUE;
		//初めに縦
		for(int i=1; i<w-1; i++) {

			if(w>=3){
				//縦縦
				long w1 = i;
				long w2=(w-w1)/2;
				long w3=w2;
				if((w-w1)%2!=0) {
					w3++;
				}
				long h1=h;
				long h2=h;
				long h3=h;

				ans = Math.min(ans, calc(w1*h1, w2*h2, w3*h3));
			}

			{
				//縦横
				long w1 = i;
				long w2 = (w-w1);
				long w3 = w2;

				long h1=h;
				long h2=h/2;
				long h3=h2;
				if(h%2 != 0) {
					h3++;
				}

				ans = Math.min(ans, calc(w1*h1, w2*h2, w3*h3));
			}
		}
		//初めに横
		for(int i=1; i<h-1; i++) {
			{
				//横縦
				{
					long w1=w;
					long w2=w/2;
					long w3=w2;
					if(w%2!=0) {
						w3++;
					}
					long h1=i;
					long h2=h-h1;
					long h3=h2;

					ans = Math.min(ans, calc(w1*h1, w2*h2, w3*h3));
				}

				//横横
				if(h>=3){
					long w1=w;
					long w2=w;
					long w3=w;
					long h1=i;
					long h2=(h-h1)/2;
					long h3=h2;
					if((h-h1)%2!=0) {
						h3++;
					}

					ans = Math.min(ans, calc(w1*h1, w2*h2, w3*h3));
				}
			}
		}
		System.out.println(ans);
		sc.close();
	}


	private long calc(long v1, long v2, long v3) {
		long smax = v1;
		long smin = v1;
		smax = Math.max(smax, v2);
		smax = Math.max(smax, v3);
		smin = Math.min(smin, v2);
		smin = Math.min(smin, v3);
		return smax-smin;
	}
}
