import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] array = new long[n];
		long num=-999999999;
		long max = 0;

		for(int i=0;i<n;i++) {
			array[i] = sc.nextLong();
		}

		for(int i=n-1;i>=1;i--) {
			if(array[i]>max) {
				max = array[i];
			}else {
				continue;
			}
			for(int j=i-1;j>=0;j--) {
				if(array[i]-array[j]>num) {
					num = array[i] - array[j];
				}
			}
		}
		System.out.println(num);

	}

	public static boolean judge(long input) {
		if(input == 2) {
			return true;
		}
		if(input <= 1 || input%2 ==0) {
			return false;
		}

		for(int i=3;i<=Math.sqrt(input);i+=2) {
			if(input % i == 0) return false;
		}
		return true;
	}
}

