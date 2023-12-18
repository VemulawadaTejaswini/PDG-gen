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
		Stack<Integer> ans=new Stack<>();
		boolean[] checked=new boolean[N-1];
		Arrays.fill(checked, false);
		boolean flag=true;
		
		while(flag) {
			flag=false;
			for (int i = 0; i < N - 1; i++) {
				if (!checked[i] && a[i] + a[i + 1] >= L) {
					a[i] = a[i] + a[i + 1];
					a[i + 1] = a[i];
					checked[i] = true;
					ans.add(i);
					flag=true;
				}
			}
		}
		
		for(int i=0;i<N-1;i++) {
			if(!checked[i]) {
				System.out.println("IMPOSSIBLE");
				return;
			}
		}
		System.out.println("POSSIBLE");
		while(!ans.isEmpty()) {
			System.out.println(ans.pop()+1);
		}
	}
}
