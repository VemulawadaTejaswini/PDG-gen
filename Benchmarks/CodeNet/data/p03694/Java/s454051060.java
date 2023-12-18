import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		int max = -1;
		int min = 1001;
		for(int i=0;i<a;i++){
			int next = sc.nextInt();
			if(next < min){
				min = next;
			}

			if(max < next){
				max = next;
			}
		}

		System.out.println(max-min);

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