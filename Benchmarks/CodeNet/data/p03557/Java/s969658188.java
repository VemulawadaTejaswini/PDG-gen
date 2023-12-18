import java.util.Arrays;
import java.util.Scanner;

class Main{

	static long ans = 0;
	static int N;
	static long M;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);			//文字の入力

		int n = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		int[] c = new int[n];

		for(int i = 0;i < n;i++){
			a[i]=sc.nextInt();
		}
		for(int i = 0;i < n;i++){
			b[i]=sc.nextInt();
		}
		for(int i = 0;i < n;i++){
			c[i]=sc.nextInt();
		}

		Arrays.sort(a);
		Arrays.sort(b);
		Arrays.sort(c);

		long[] counta = new long[n];
		for(int i = 0;i < n;i++){
			counta[i] = lowerbond(b[i], a);
//			System.out.println("i "+ +i);
//			System.out.println("counta[i]" +counta[i]);
			
		}


		long[] countc = new long[n];
		for(int i = 0;i < n;i++){
			countc[i] =n- upperbond(b[i], c);
//			System.out.println("i "+ +i);
//			System.out.println("countB[i]" +countc[i]);
		}



		long ans = 0;
		for(int i = 0;i < n;i++){
			ans += counta[i] * countc[i];
		}
		System.out.println(ans);
		
	


	}
	static int upperbond(int k, int[] data){		//kより小さい最大の値をdataの中から探し、返す二分探索
		int min = -1;
		int max = data.length;

		while(max-min > 1){
			int mid = (max+min)/2;
			if(data[mid] > k){
				max = mid;
			}else{
				min = mid;
			}
		}
		return max;
	}

	static int lowerbond(int k, int[] data){		//kより小さい最小の値をdataの中から探し、返す二分探索
		int min = -1;
		int max = data.length;

		while(max-min > 1){
			int mid = (max+min)/2;
			if(data[mid] >= k){
				max = mid;
			}else{
				min = mid;
			}
		}
		return min+1;
	}





}



