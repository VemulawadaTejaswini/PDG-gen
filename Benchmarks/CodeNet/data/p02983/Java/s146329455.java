import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// input
		long left = scan.nextLong();
		long right = scan.nextLong();

		// check
		long iMin = Long.MAX_VALUE;
		long iIndex = 0;
		for(long i = left; i < left + 2019 & i < right ; i++){
			if(i % 2019 < iMin) {
				iMin = i % 2019;
				iIndex = i;
			}
		}
		long jMin = Long.MAX_VALUE;
		for(long j = left; j < left + 2019 & j <= right; j++){
			if(j == iIndex) {
				continue;
			}
			if(j % 2019 < jMin) {
				jMin = j % 2019;
			}
		}

		// answer
		System.out.println(iMin * jMin % 2019);
	}
}

