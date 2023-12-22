import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

	
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()) {
			System.out.println(sumof4alg1(sc.nextInt()));
		}
		
	}

	//kテ」ツつ津」ツ?凖」ツ?ケテ」ツ?ヲティツゥツヲテ」ツ?凖ヲツ鳴ケテヲツウツ?
	static int sumof4alg1(int n) {
		int result = 0;
		for(int k = 0; k <= n; k++) {
			result += (k + 1) * (n - k + 1);
		}
		
		
		return result;
	}
	
}