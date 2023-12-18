import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//数値を入力
		int N = sc.nextInt();
		//変数宣言
		int cake = 4;
		int donuts = 7;
		//計算
		int ans1 = N % cake;
		int ans2 = N % donuts;
		int ans3 = N % (cake + donuts);
		int ans4 = ans3 / cake;
		int ans5 = ans3 / cake;
		//判断
		if(ans1 == 0){
			System.out.println("Yes");
		}
		else if(ans2 == 0){
			System.out.println("Yes");
		}
		else if(ans3 == 0){
			System.out.println("Yes");
		}
		else if(ans4 == 0 || ans5 == 0){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}
	}
}