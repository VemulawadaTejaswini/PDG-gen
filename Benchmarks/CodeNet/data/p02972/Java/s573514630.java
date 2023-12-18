import java.util.Scanner;
class Main{


	static char[][] map;

	static long[][] c;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力
		int n = sc.nextInt();
		int[] a = new int[n];
		
		for(int i = 0;i < n;i++){
			a[i] = sc.nextInt();
 		}
		int[] sub = new int[n];
		int ans = 0;
		
		for(int i = n-1;i >= 0;i--){
			int sum = 0;
			for(int j = i;j < n;j+=i+1){
				sum += sub[j];
			}
			if(a[i] == 0){
				if(sum % 2 == 0){
					sub[i] = 0;
				}else{
					sub[i] = 1;
					ans++;
				}
			}else{
				if(sum % 2 == 0){
					sub[i] = 1;
					ans++;
				}else{
					sub[i] = 0;
				}
			}
			
		}
		
		System.out.println(ans);
		int count = 0;
		for(int i = 0;i < n;i++){
			if(count == ans){
				return;
			}
			System.out.print(sub[i] + " ");

			if(sub[i] == 1){
				count++;
			}
			
		}
		

		
		
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




