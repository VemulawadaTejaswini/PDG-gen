import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String S = scan.nextLine();
		int pow_of_ten = 1;
		int sum = 0;
		int[] remainder = new int[2019];

		for(int i = S.length() - 1; i >= 0; i--){
			sum += (S.charAt(i) - '0') * pow_of_ten;
			pow_of_ten *= 10;
			sum %= 2019;
			pow_of_ten %= 2019;
			remainder[sum] += 1;
			//System.out.println(sum);
		}

		int answer = 0;
		remainder[0] += 1;
		for(int i = 0; i < 2019; i++){
			//System.out.println(remainder[i]);
			int m = remainder[i];
			answer += (m * (m - 1)) / 2;
		}
		System.out.println(answer);
	}
}
