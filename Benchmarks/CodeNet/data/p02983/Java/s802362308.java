import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		long L = scan.nextLong();
		long R = scan.nextLong();

		long min = Long.MAX_VALUE;

		for(long i=L;i<R;i++) {
			for(long j=L+1;j<=R;j++) {
			if(L*R >=2019) {
			min = Math.min(min, (j*i)%2019);
			}else {
				min = L*R;
				break;
			}
			if(min == 0) {
				break;
			}
			}
		}

		System.out.println(min);
		scan.close();

	}

}
