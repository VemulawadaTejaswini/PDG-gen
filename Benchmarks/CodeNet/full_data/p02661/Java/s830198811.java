import java.util.Scanner;

public class Main {
	static long searchLow(long A[] , long B[]){
		long left = 0;
		long right = 1000000000;
		int N = A.length;
		while(right - left > 1){
			long mid = (left + right) / 2;
			int large = 0;			
			int small = 0;
			for(int i = 0 ; i < A.length ; ++i){
				if(mid < A[i]){
					++large;
				}
				if(mid > B[i]){
					++small;
				}
			}
			int other = A.length - small - large;
			if(small + other > N / 2){
				right = mid;
			}else{
				left = mid;
			}
		}
		return right;
	}
	static long searchHigh(long A[] , long B[]){
		long left = 0;
		long right = 1000000000;
		int N = A.length;
		while(right - left > 1){
			long mid = (left + right) / 2;
			int large = 0;			
			int small = 0;
			for(int i = 0 ; i < A.length ; ++i){
				if(mid < A[i]){
					++large;
				}
				if(mid > B[i]){
					++small;
				}
			}		
			int other = A.length - small - large;
//			System.out.println(small+" "+large+" "+mid+" "+other);
			if(large + other > N / 2){
				left = mid;
			}else{
				right = mid;
			}
		}
//		System.out.println(left+" "+right);
		return left;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long A[] = new long[N];
		long B[] = new long[N];
		for(int i = 0 ; i < N ; ++i){
			A[i] = sc.nextLong();
			B[i] = sc.nextLong();
		}
		if(N % 2 == 1){
			long low = searchLow(A, B);
			long high = searchHigh(A, B);
//			System.out.println(low+" "+high);
			System.out.println((high - low + 1));			
		}else{
			System.out.println(A[-1]);
		}
	}
}
