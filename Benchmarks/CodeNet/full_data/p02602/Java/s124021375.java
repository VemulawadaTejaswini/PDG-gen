import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int [] array = new int[200000];
		Arrays.fill(array,1);
		for(int i=0;i<n;i++) {
			array[i] = sc.nextInt();
		}
		sc.close();

//		long MOD = 1000000007L;
//		long[] bigArray = new long[n-k+1];
//		bigArray[0] = 1L;
//
//		for(int i=0;i<k;i++) {
//			bigArray[0] = bigArray[0]*array[i];
//		}

		for(int i=0;i<n-k;i++) {
//			bigArray[i+1] = bigArray[i]/array[i]*(array[i+k]);
			if(array[i]<array[i+k]) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
		}
	}
}