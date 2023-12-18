import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
			int sum=0;
		for(int j=1; j<=n; j=j+2){
			// スペース区切りの整数の入力
				int miniSum =0;
			for(int i=1; i<=j; i++){
				if(j % i == 0){
				miniSum++;
				}
			}
			if(miniSum==8){
				sum++;
			}
		}
		System.out.println(sum);
	}
}