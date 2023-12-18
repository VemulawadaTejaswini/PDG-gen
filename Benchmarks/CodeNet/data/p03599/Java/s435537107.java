import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}



	public void run() {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();
		int e=sc.nextInt();
		int f=sc.nextInt();

		//水
		long max = 0;
		long ans1 = 0;
		long ans2 = 0;
		for(int i=0; i<=f; i += a*100) {
			for(int j=0; j<=f-i; j += b*100) {
				for(int k=0; k<=f-i-j; k+=c) {
					for(int l=0; l<=f-i-j-k; l+=d) {
						if(i+j==0) {
							continue;
						}
						if(100*(k+l)/(i+j) > (100*e/100)) {
							continue;
						}
						if(max < (100 * (k+l))/(i+j+k+l)) {
							max = (100 * (k+l))/(i+j+k+l);
							ans1 = i+j+k+l;
							ans2 = k+l;
						}
					}
				}
			}
		}
		System.out.println(ans1 + " "+ ans2);
		sc.close();
	}

}
