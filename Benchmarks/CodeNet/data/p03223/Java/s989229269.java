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
//		int mode = 0;
//
//		if(n % 2 == 1){
//			int centerIndex = n/2;
//
//			if(a[centerIndex] - a[left] < -(a[centerIndex] - a[right])){
//				mode = 1;
////				System.out.println(a[right] +" - " +a[centerIndex]+"");
//				sum += -(a[centerIndex] - a[right]);
//			}
//			else {
//				sum += a[centerIndex] - a[left];
//			}
//		}
//		else {
//			int center1 = n/2 - 1;
//			int center2 = n/2;
//
//			if(a[center2] - a[left] < a[right] - a[center1]){
//				mode = 1;
////				System.out.println(a[right] +" - " +a[center1]+"");
//				sum += a[right] - a[center1];
//			}
//			else {
////				System.out.println(a[center2] +" - " +a[left]+"");
//				sum += a[center2] - a[left];
//			}
//		}
//
//		int count = 0;
//
//		while(count < n - 2){
////			System.out.println(a[right] +" - " +a[left]+"");
//			sum += a[right] - a[left];
// 			if(mode == 0){
//				left++;
//				mode = 1;
//			}
// 			else {
// 				right--;
// 				mode = 0;
// 			}
//
// 			count++;
//		}

//		while(left < right){
//			System.out.println(a[right]+ " - " +a[left]);
//			sum += a[right] - a[left];
//
//			if(a[right] - a[left + 1] > a[right - 1] - a[left]){
//				left++;
//			}
//			else {
//				right--;
//			}
//		}

		//左からスタート
		long sumL = 0;

		int mode = 0;
		while(left < right + 1){
//			System.out.println(a[right]+ " - " +a[left]);
			sumL += a[right] - a[left];

			if(mode == 0){
				left++;
				mode = 1;
			}
			else {
				right--;
				mode = 0;
			}
		}
		sumL += a[left - 1] - a[0];
//		System.out.println(sumL);

		//右からスタート
		long sumR = 0;
		left = 0;
		right = n - 1;

		mode = 1;
		while(left < right + 1){
//			System.out.println(a[right]+ " - " +a[left]);
			sumR += a[right] - a[left];

			if(mode == 0){
				left++;
				mode = 1;
			}
			else {
				right--;
				mode = 0;
			}
		}
		sumR += a[n - 1] - a[left];
//		System.out.println(sumR);

		System.out.println(Math.max(sumL, sumR));
	}

}
