import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Stack;

public class Main {
	
	public static void main(String[] args) {
		new Main().solve();
	}
	int MAX=1000002;
	
	void solve(){
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int L=sc.nextInt();
		int[]a=new int[N];
		for(int i=0;i<N;i++) {
			a[i]=sc.nextInt();
		}
		int last=-1;
		for(int i=0;i<N-1;i++) {
			if(a[i]+a[i+1]>=L) {
				last=i;
				break;
			}
		}
		if(last==-1) {
			System.out.println("Impossible");
			return;
		}else {
			System.out.println("Possible");
			for(int i=0;i<=last;i++) {
				System.out.println(i+1);
			}
			for(int i=N-1;i>last+1;i--) {
				System.out.println(i);
			}
		}
	}
}
