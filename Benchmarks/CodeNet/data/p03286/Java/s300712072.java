import java.util.Scanner;
public class Question105 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		if(N >= 0) {
			String N2 = Integer.toBinaryString(N);
			int plus = 0;

			int l = N2.length();


				for(int i=0; i<l/2; i++) {
					if(Character.getNumericValue(N2.charAt(l-2-2*i)) == 1) {
						plus += Math.pow(2, 2*i+2);
					}
				}

				N += plus;

				N2 = Integer.toBinaryString(N);
				System.out.println(N2);
		}else {
			N *= -1;
			String N2m = Integer.toBinaryString(N);
			int plus = 0;

			int l = N2m.length();


				for(int i=0; i<=l/2; i++) {
					if(Character.getNumericValue(N2m.charAt(l-1-2*i)) == 1) {
						plus += Math.pow(2, 2*i+1);
					}
				}

				N += plus;

				N2m = Integer.toBinaryString(N);
				System.out.println(N2m);
		}

	}

}
