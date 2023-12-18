import java.util.ArrayList;
import java.util.Scanner;
class Main{


	static char[][] map;
	static final int MOD = 1000000007;


	static long[][] c;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力

		String s = sc.next();
		ArrayList<Integer> R = new ArrayList<Integer>();
		ArrayList<Integer> L = new ArrayList<Integer>();

		for(int i = 0;i < s.length();i++){
			if(s.charAt(i) == 'R'){
				R.add(i);
			}else{
				L.add(i);
			}
		}
		
//		System.out.println("R");
//		for(int i = 0;i < R.size();i++){
//			System.out.print(R.get(i) + " ");
//			
//		}
//		System.out.println();
//
//		System.out.println("L");
//		for(int i = 0;i < L.size();i++){
//			System.out.print(L.get(i) + " ");
//			
//		}
//		System.out.println();



		int[] ans = new int[s.length()];
		for(int i = 0;i < s.length();i++){
			if(s.charAt(i) == 'R'){
				int next = upperbond(i,L);
//				System.out.println("R " + next);

				if((next - i) % 2 == 0){
					ans[next]++;
				}else{
					ans[next-1]++;
				}
			}else{
				int next = lowerbond(i,R);
//				System.out.println("L " + next);

				if((i - next) % 2 == 0){
					ans[next]++;
				}else{
					ans[next+1]++;
				}
			}
		}


		for(int i = 0;i < s.length();i++){
			System.out.print(ans[i] + " ");
		}



	}
	
	

	static int upperbond(int k, ArrayList<Integer> data){		//kより小さい最大の値をdataの中から探し、返す二分探索
		int min = -1;
		int max = data.size();

		while(max-min > 1){
			int mid = (max+min)/2;
			if(data.get(mid) > k){
				max = mid;
			}else{
				min = mid;
			}
		}
		return data.get(max);
	}

	static int lowerbond(int k, ArrayList<Integer> data){		//kより小さい最小の値をdataの中から探し、返す二分探索
		int min = -1;
		int max = data.size();

		while(max-min > 1){
			int mid = (max+min)/2;
			if(data.get(mid) >= k){
				max = mid;
			}else{
				min = mid;
			}
		}
		return data.get(min);
	}



	static int gcd(int a,int b){				//最大公約数を返す
		if(b == 0){
			return a;
		}else{
			return gcd(b, a%b);
		}
	}
	static long gcd(long a,long b){
		if(b == 0){
			return a;
		}else{
			return gcd(b, a%b);
		}
	}



	static long lcm (long a, long b) {
		long g = gcd(a,b);
		return a/g*b;
	}




}



class Pair implements Comparable{
	int from;
	int end;
	@Override
	public int compareTo(Object other) {
		Pair otherpair = (Pair)other;

		return   end- otherpair.end;
	}








}




