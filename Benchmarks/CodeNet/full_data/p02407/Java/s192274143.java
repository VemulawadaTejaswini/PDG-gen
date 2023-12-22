import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Integer nums[] = new Integer[n];
		for(int i=0; i<n; i++) {
			nums[i] = sc.nextInt();
		}

		for(int i=n-1; i>=0; i--) {
			System.out.print(nums[i]);
			if(i!=0) System.out.print(" ");
		}

		sc.close();
	}

}

