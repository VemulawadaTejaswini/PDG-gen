package ABC085D;
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
				for(int j=i*2; j<100000; j+=i) {
					p[j]=false;
				}
			}
		}
		for(int i=0; i<q; i++) {
			int l=sc.nextInt();
			int r=sc.nextInt();
			int cnt=0;
			for(int k=l; k<=r; k+=2) {
				if(p[k] && p[(k+1)/2]) {
					cnt++;
				}
			}
			System.out.println(cnt);
		}
		sc.close();
	}
}
