
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int a[] = new int[n];
		int b[] = new int[n];
		for(int i=0; i<n; i++) {
			a[i]=sc.nextInt();
		}

		ArrayList<Integer>ans = new ArrayList<>();
		for(int i=n-1; i>=0; i--) {
			int cnt = 0;
			int step = i+1;
			for(int j=i+step; j<n; j+=step) {
				if(b[j]==1) cnt++;
			}
			if((cnt%2) != a[i]) {
				b[i]=1;
				ans.add(i+1);
			}

		}
		System.out.println(ans.size());
		for(int i=0; i<ans.size(); i++) {
			System.out.print(ans.get(i) + (i<ans.size()-1 ? " " : "\n"));
		}
		sc.close();
	}
}
