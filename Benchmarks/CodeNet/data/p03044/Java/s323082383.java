import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		int buff1,buff2;
		long[] count = new long[1000000];

		for(long i=0;i<n;i++) {
			buff1 = sc.nextInt();
			buff2 = sc.nextInt();
			if(sc.nextLong()%2==0) {
				count[buff1] = 0;
				count[buff2] = 0;
			}else {
				count[buff1] = 0;
				count[buff2] = 1;
			}
		}

		for(int i=0;i<n;i++) {
			System.out.println(count[i]);
		}

	}
}


