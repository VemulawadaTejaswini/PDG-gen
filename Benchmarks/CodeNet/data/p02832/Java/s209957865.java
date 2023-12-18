import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int v=1;
		int si=-1;
		int ans=0;
		for(int i=0; i<n; i++) {
			int a=sc.nextInt();
			if(a==v) {
				ans +=i-(si+1);
				v++;
				si=i;
			}
		}
		if(ans==0) {
			System.out.println(-1);
		} else {
			System.out.println(ans + n-si-1);
		}
		sc.close();
	}
}
