import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}
	public void run() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		a[0]=sc.nextInt();
		int cnt=0;
		for(int i=1; i<n; i++) {
			int v=sc.nextInt();
			if(a[i-1]>0) {
				if(a[i-1]+v>=0) {
					while(a[i-1]+v>=0) {
						v--;
						cnt++;
					}
				}
			} else {
				if(a[i-1]+v<=0) {
					while(a[i-1]+v<=0) {
						v++;
						cnt++;
					}
				}
			}
			a[i]=a[i-1]+v;
		}
		System.out.println(cnt);
		sc.close();
	}

}


