import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}
	public void run() {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int sum[]=new int[n];
		sum[0]=sc.nextInt();
		boolean evenPlus = true;
		if(sum[0]<0) evenPlus=false;
		int ans = 0;
		for(int i=1; i<n; i++) {
			int a = sc.nextInt();
			if(i%2==0) {
				if(evenPlus) {
					if(sum[i-1]+a <= 0) {
						ans += 1-(sum[i-1]+a);
						sum[i]=1;
					} else {
						sum[i]=sum[i-1]+a;
					}

				} else {
					if(sum[i-1]+a >= 0) {
						ans += Math.abs(sum[i-1]+a)+1;
						sum[i]=-1;
					} else {
						sum[i]=sum[i-1]+a;
					}

				}
			} else {
				if(!evenPlus) {
					if(sum[i-1]+a <= 0) {
						ans += 1-(sum[i-1]+a);
						sum[i]=1;
					} else {
						sum[i]=sum[i-1]+a;
					}

				} else {
					if(sum[i-1]+a >= 0) {
						ans += Math.abs(sum[i-1]+a)+1;
						sum[i]=-1;
					} else {
						sum[i]=sum[i-1]+a;
					}
				}
			}
		}
		System.out.println(ans);
		sc.close();
	}

}


