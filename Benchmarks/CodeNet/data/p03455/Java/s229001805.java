import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// スペース区切りの整数の入力
		int a = sc.nextInt();
		int b = sc.nextInt();
      	int ans = a * b;
		//偶数か奇数を判定
       	if(ans % 2 == 0){
        	System.out.println("偶数");
        } else {
        	System.out.println("奇数");
        }
	}
}