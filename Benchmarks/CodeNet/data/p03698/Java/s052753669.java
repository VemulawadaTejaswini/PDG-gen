import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Main{

	static int N;
	static int M;
	static 		ArrayList<ArrayList<Integer>> map;
	static boolean[] used;
	static int f = 0;
	static int s = 0;

	static long mod = 1000000007;
	static ArrayList<Integer> saitan;




	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);			//文字の入力
		String string = sc.next();
		char[] cs = string.toCharArray();
		Arrays.sort(cs);
		for(int i = 0;i < string.length()-1;i++){
			if(cs[i] == cs[i+1]){
				System.out.println("no");
				return;
			}
		}
		System.out.println("yes");







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
		return data[max];
	}


	static long cal(int n){
		long x = (long)n;
		for(int i = n-1;i > 0;i--){
			//	System.out.println(i);
			x *= i;
			x %= mod;
		}
		return x;
	}

}


