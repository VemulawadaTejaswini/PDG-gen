import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		long L = scan.nextLong();
		long R = scan.nextLong();
		long min = Long.MAX_VALUE;

		for(long i=L+1;i<=R;i++) {
			if(L*R >=2019) {
			min = Math.min(min, (L*i)%2019);
			}else {
				min = L*R;
			}
		}

		System.out.println(min);
		scan.close();

	}

}
