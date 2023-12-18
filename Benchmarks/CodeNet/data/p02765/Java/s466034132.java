import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); //入力数
		int K = sc.nextInt(); //進数
		
		double max = 0; //入力した数より小さい数のうち最大の進数の累乗
		double sum = 0; //maxを足し込むための数値
		int count = 0; //累乗のカウント
		
		
		a: while(sum < N){
			for(int i=1;i<K;i++){
				max = Math.pow((double)K, (double)count) * i;
				System.out.println("max:"+max+"count:"+count);
				if(N < sum){
					if(i == 1) count = count - 1;
					break a;
				}
			}
			sum = sum + max;
			count++;
		}
			
		int ans = (int)count + 1;
		System.out.println(ans);
	}
}

		