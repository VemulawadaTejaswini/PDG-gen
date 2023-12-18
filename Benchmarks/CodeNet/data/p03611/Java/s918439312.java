import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}



	public void run() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int a[] = new int[100000+1];
		for(int i=0; i<n; i++) {
			int v=sc.nextInt();
			a[v]++;
		}
		int ans = -1;
		for(int i=0; i<100000+1; i++) {
			int tmp=a[i];
			if(i>1) tmp +=a[i-1];
			if(i<n-1) tmp +=a[i+1];
			ans = Math.max(ans,tmp);
		}
		System.out.println(ans);
		sc.close();
	}

}
