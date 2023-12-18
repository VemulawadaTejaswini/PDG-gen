import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int max;
		
		if(a<=b){
			if(b<=c){
				max = c;
			}else{
				max = b;
			}
		}else{
			if(a<=c){
				max = c;
			}else{
				max = a;
			}
		}

		System.out.println(a+b+c-max);
		
	}

	private static int calc(int[] a,int ans,int n) {
		int sum=a[0];
		boolean plusFlag;
		// TODO 自動生成されたメソッド・スタブ
		if(a[0] > 0){
			plusFlag = true;
		}else{
			plusFlag = false;
		}



		for(int i = 1;i<n;i++){
			sum += a[i];
			if(plusFlag){
				if(sum >= 0){
					ans += Math.abs(sum)+1;
					sum = -1;

				}
			}else{
				if(sum <= 0){
					ans += Math.abs(sum)+1;
					sum = 1;
				}
			}
			plusFlag = !plusFlag;
		}


		return ans;
	}


}