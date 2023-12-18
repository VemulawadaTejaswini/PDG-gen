import java.util.Arrays;
import java.util.Scanner;

class Main{




	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力
		int n = sc.nextInt();
		long pow = 1000000000+7;

		int[] data = new int[n];
		for(int i=0;i < n;i++){
			data[i] = sc.nextInt();
		}
		Arrays.sort(data);
		
		
		if(n%2==1){					//人数が奇数
			if(data[0] !=0){
				System.out.println(0);
				return;
			}
			for(int i = 1;i < n-1;i++){
				if(data[i] != data[i+1]){
					System.out.println(0);
					return;
				}
				i++;
			}
			
			int ans = 1;
			for(int i = 0;i <(data.length-1)/2;i++){
				ans *= 2;
				ans %= pow;
			}

			System.out.println(ans);	
		}else{					//人数が偶数
			if(data[0] ==0){
				System.out.println(0);
				return;
			}
			for(int i = 0;i < n-1;i++){
				if(data[i] != data[i+1]){
					System.out.println(0);
					return;
				}
				i++;
			}
			
			int ans = 1;
			for(int i = 0;i <data.length/2;i++){
				ans *= 2;
				ans %= pow;
			}

			System.out.println(ans);	
			
			
		}
		


	}
}

class Pair implements Comparable{
	int from;
	int end;
	@Override
	public int compareTo(Object other) {
		Pair otherpair = (Pair)other;

		return end - otherpair.end;
	}
}


