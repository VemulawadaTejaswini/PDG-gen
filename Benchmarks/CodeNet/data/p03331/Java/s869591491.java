import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Integer N = sc.nextInt();
		Integer A, B;
		Integer minSum = 100;

		for (A=1; A<N-1; A++) {
			B = N-A;

			String aStr = A.toString();
			String bStr = B.toString();

			List<String> aDigitList = Arrays.asList(aStr.split(""));
			List<String> bDigitList = Arrays.asList(bStr.split(""));

			int sum=0;

			for(String aDigit : aDigitList) {
				sum += Integer.parseInt(aDigit);
			}

			for(String bDigit : bDigitList) {
				sum += Integer.parseInt(bDigit);
			}

			minSum = Math.min(minSum, sum);
		}

		if(N==2) {
			minSum = 2;
		}


		System.out.println(minSum);
	}
}

