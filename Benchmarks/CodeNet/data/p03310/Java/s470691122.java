import java.util.Arrays;
import java.util.Scanner;

class Main{
	static int G;
	static int D;
	static int[] p;
	static int[] c;
	static boolean[] used;
	static long ans = 1000000000;


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力
		int n = sc.nextInt();
		long[] a = new long[n+1];
		for(int i = 1;i <= n;i++){
			a[i] = sc.nextLong();
		}
		long[] sum = new long[n+1]; 
		for(int i = 1;i <= n;i++){
			sum[i] = a[i] + sum[i-1];
//			System.out.print(sum[i] + " ");
		}
//		System.out.println();
		long ans = 1000000000;
		for(int i = 2;i <= n-2;i++){				//真ん中の仕切りのいち
//			System.out.println("ans "+ans);
			long left = lowerbond(sum[i]/2, sum,0,1,i);			//左の仕切りのいち
			//System.out.println("left "+left);

			long A1 = sum[(int)left];
			long B1 = sum[i] - sum[(int)left];
			
			left = higherbond(sum[i]/2, sum,0,1,i-1);			//左の仕切りのいち
			//System.out.println("left "+left);

			long A2 = sum[(int)left];
			long B2 = sum[i] - sum[(int)left];
			
			long A = 0;
			long B = 0;
			if(Math.abs(A2- B2) < Math.abs(A1-B1)){
				A = A2;
				B = B2;
			}else{
				A = A1;
				B = B1;
			}
			
			long right = lowerbond((sum[n]-sum[i])/2, sum,sum[i],i+1,sum.length-1);			//右の仕切りのいち
			long C1 = sum[(int)right] - sum[i];
			long D1 = sum[n] - sum[(int)right];

			right = higherbond((sum[n]-sum[i])/2, sum,sum[i],i+1,sum.length-1);			//右の仕切りのいち
			long C2 = sum[(int)right] - sum[i];
			long D2 = sum[n] - sum[(int)right];
			
			long C = 0;
			long D = 0;
			if(Math.abs(C2- D2) < Math.abs(C1-D1)){
				C = C2;
				D = D2;
			}else{
				C = C1;
				D = D1;
			}
			
//			System.out.println("i "+i+" left "+left+" right "+right);
//			System.out.println("A "+A+" B "+B+" C "+C + " D "+D);

			Long[] hako = {A,B,C,D};
			Arrays.sort(hako);
			ans = (long)Math.min(ans, hako[3]-hako[0]);
			
			
			
//			System.out.println("ans " +ans);
//
//			System.out.println();

		}
		
		System.out.println(ans);
		


	}
	static long lowerbond(long k, long[] data,long d,int min,int max){		//kより小さい最小の値をdataの中から探し、返す二分探索
//		int min = -1;
//		int max = data.length;

		while(max-min > 1){
			int mid = (max+min)/2;
//			System.out.println("max "+max + " mid "+mid+" min "+min);

			if(data[mid]-d >= k){
				max = mid;
			}else{
				min = mid;
			}
		}
//		System.out.println("ok");

		return min;
	}
	
	static long higherbond(long k, long[] data,long d,int min,int max){		//kより小さい最小の値をdataの中から探し、返す二分探索
//		int min = -1;
//		int max = data.length;

		while(max-min > 1){
			int mid = (max+min)/2;
//			System.out.println("max "+max + " mid "+mid+" min "+min);

			if(data[mid]-d >= k){
				max = mid;
			}else{
				min = mid;
			}
		}
//		System.out.println("ok");

		return max;
	}



}

class Pair implements Comparable{
	int from;		//p
	int end;		//y
	int num;
	int bango;
	@Override
	public int compareTo(Object other) {
		Pair otherpair = (Pair)other;

		return from - otherpair.from;
	}
}

