import java.util.Scanner;

class Main{


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力
		int n = sc.nextInt();
		String S = sc.next();
		int[] w = new int[n+1];
		int[] e = new int[n+1];
		for(int i = 0;i < n;i++){
			if(S.charAt(i) == 'E'){
				e[i+1] = e[i]+1;
			}else{
				e[i+1] = e[i];
			}
		}
		for(int i = 0;i < n;i++){
			if(S.charAt(i) == 'W'){
				w[i+1] = w[i]+1;
			}else{
				w[i+1] = w[i];
			}
		}
		long ans = Long.MAX_VALUE;
		for(int i = 1;i <= n;i++){
			int sum = w[i-1] + (e[n] - e[i]);
			if(sum <= ans){
				ans = sum;
			}
		}
		System.out.println(ans);
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

		return end - otherpair.end;
	}
}

