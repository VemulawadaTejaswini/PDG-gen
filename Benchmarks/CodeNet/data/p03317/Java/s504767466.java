
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int a[] = new int[n];
		for(int i=0; i<n; i++) {
			a[i]=sc.nextInt();
		}
		int j=-1;
		for(int i=0; i<n; i++) {
			if(a[i]==1) {
				j=i;
				break;
			}
		}
		int cnt=0;
		for(int i=j; i<=n-k+1; i+=k-1) {
			cnt++;
		}
		for(int i=j; i>=k-1; i-=k-1) {
			cnt++;
		}
		System.out.println(cnt);
		sc.close();
	}


}
