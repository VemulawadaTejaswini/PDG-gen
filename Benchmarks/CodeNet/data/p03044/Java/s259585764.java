import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int buff1=0,buff2=0;
		long buff3=0;
		long[] count = new long[1000000];

		for(int i=0;i<n-1;i++) {
			buff1 = sc.nextInt();
			buff2 = sc.nextInt();
			buff3 = sc.nextLong();

			if(buff3%2==0) {
				if(buff1==0) {
					count[buff1] = 0;
					count[buff2] = 0;
				}else {
					count[buff1] = 1;
					count[buff2] = 1;
				}
			}else {
				if(buff1==0) {
					count[buff1] = 0;
					count[buff2] = 1;
				}else {
					count[buff1] = 1;
					count[buff2] = 0;
				}
			}
		}

		for(int i=1;i<=n;i++) {
			System.out.println(count[i]);
		}

	}
}


