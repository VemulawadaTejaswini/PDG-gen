import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().solve();
	}
	int N;
	int[]a;
	void solve(){
		Scanner sc=new Scanner(System.in);
		N=sc.nextInt();
		a=new int[N];
		int min=1000;
		int max=0;
		
		for(int i=0;i<N;i++){
			a[i]=sc.nextInt();
			min=Math.min(min, a[i]);
			max=Math.max(max, a[i]);
		}
		
		System.out.println(max-min);
	}

}
