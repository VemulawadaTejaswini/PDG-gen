import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//合計枚数
		int n = sc.nextInt();
		//int n = 3;
		//合計金額
		int y = sc.nextInt();
		//int y = 25000;
		//答え出力用
		int ans1 = -1;
		int ans5 = -1;
		int ans10 = -1;

	if((y%1000 == 0) && (y/1000 <= n)){
			ans1 = y/1000;
			ans5 = 0;
			ans10 = 0;
	}else if ((y%10000 == 0) && (y/10000 <= n)){
			ans1 = 0;
			ans5 = 0;
			ans10 = y/10000;
	}else if((y%1000 == 0) && (y/1000 > n)){
			ans1 = y/1000;
			ans10 = ans1/10;
			ans1 =  ans1 - ans10*10;
			ans5 = 0;
			if(ans1 + ans10 <= n){
				//何もしない
			}else{
				ans1 = y/1000;
				ans5 = ans1/5;
				ans1 = ans1 - ans5*5;
				ans10 = 0;
				if(ans1 + ans5 <= n){
					//何もしない
				}else if (ans1 + ans5 > n){
					ans5 = y/5000;
					ans10 = ans5/2;
					ans5 = ans5 - ans10*2;
					ans1 = 0;
				}else if (ans5 + ans10 <=n){
					//何もしない
				}else{
					ans1 = -1;
					ans5 = -1;
					ans10 = -1;
				}
			}
		}
	System.out.println(ans10 + " " + ans5 + " "+ ans1);
	}
}
