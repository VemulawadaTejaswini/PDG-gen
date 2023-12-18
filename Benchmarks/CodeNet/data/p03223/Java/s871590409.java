import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		long a[] = new long[n];
		for(int i = 0; i < n; i++){
			a[i] = sc.nextLong();
		}

		Arrays.sort(a);

		long sum = 0;

		int left = 0;
		int right = n - 1;

//		int centerIndex = 0;
//		0 left 1 right
		int mode = 0;

		if(n % 2 == 1){
			int centerIndex = n/2;

			if(a[centerIndex] - a[left] < a[right] - a[centerIndex]){
				mode = 1;
//				System.out.println(a[right] +" - " +a[centerIndex]+"");
				sum += a[right] - a[centerIndex];
			}
			else {
				sum += a[centerIndex] - a[left];
			}
		}
		else {
			int center1 = n/2 - 1;
			int center2 = n/2;

			if(a[center2] - a[left] < a[right] - a[center1]){
				mode = 1;
//				System.out.println(a[right] +" - " +a[center1]+"");
				sum += a[right] - a[center1];
			}
			else {
//				System.out.println(a[center2] +" - " +a[left]+"");
				sum += a[center2] - a[left];
			}
		}

		int count = 0;

		while(count < n - 2){
//			System.out.println(a[right] +" - " +a[left]+"");
			sum += a[right] - a[left];
 			if(mode == 0){
				left++;
				mode = 1;
			}
 			else {
 				right--;
 				mode = 0;
 			}

 			count++;
		}


		System.out.println(sum);
	}

}
