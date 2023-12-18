
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}



	public void run() {
		Scanner sc = new Scanner(System.in);
		int q=sc.nextInt();
		boolean p[]=new boolean[100000+1];
		for(int i=2; i<=100000; i++) p[i]=true;
		for(int i=2; i*i<=100000; i++) {
			if(p[i]) {
				for(int j=i+i; j<100000; j+=i) {
					p[j]=false;
				}
			}
		}
		int c[] = new int[100000+1];
		c[0]=c[1]=0;
		for(int i=2; i<=100000; i++) {
			if(p[i]&p[(i+1)/2]) {
				c[i]++;
			}
		}
		for(int i=0; i<100000; i++)c[i+1] +=c[i];
		for(int i=0; i<q; i++) {
			int l=sc.nextInt();
			int r=sc.nextInt();
			int cnt=0;
			int ans = c[r]-c[l-1];
			System.out.println(ans);
		}
		sc.close();
	}
}
