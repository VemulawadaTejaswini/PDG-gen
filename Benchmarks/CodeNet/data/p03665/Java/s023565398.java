import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int p = sc.nextInt();
		int[] biscuitsInfo = new int[n];
		int odd =0;
		int even =0;
		for(int i =0;i < n;i++) {
			int biscuit = sc.nextInt();
			biscuitsInfo[i] = biscuit;
			if(biscuit % 2 ==0) {
				even++;
			}else {
				odd++;
			}
		}
		System.out.println((long)(Math.pow(2,odd) / 2) * (long)Math.pow(2,even));
	}
}