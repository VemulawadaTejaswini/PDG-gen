import java.util.*;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int max1 = 0;
		int max2 = 0;
		int cnt[] = new int[200000+1];
		int a[] = new int[200000];
		for(int i=0; i<n; i++) {
			int v = sc.nextInt();
			if(max1 < v) {
				max2 = max1;
				max1 = v;
			}else if(max2 < v){
				max2 = v;
			}
			a[i]=v;
			cnt[v]++;
		}
		for(int i=0; i<n; i++) {
			int v = a[i];
			if(v==max1 && cnt[v]==1) {
				System.out.println(max2);
			}else {
				System.out.println(max1);
			}
		}
		sc.close();
	}
}
