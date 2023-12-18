import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().solve();
	}
	
	void solve() {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[]a=new int[n];
		int[]b=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
			b[i]=sc.nextInt();
		}
		int maxa=0;
		int maxb=0;
		int mina=Integer.MAX_VALUE/2;
		int minb=Integer.MAX_VALUE/2;
		for(int i=0;i<n;i++) {
			if(maxa<a[i]) {
				maxa=a[i];
				maxb=b[i];
			}
			if(mina<a[i]) {
				mina=a[i];
				minb=b[i];
			}
		}
		int ans=maxa+maxb;
		System.out.println(ans);
	}
}