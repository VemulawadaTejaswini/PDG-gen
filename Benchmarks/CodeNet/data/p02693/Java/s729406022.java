import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int k = sc.nextInt();
		// スペース区切りの整数の入力
		int a = sc.nextInt();
		int b = sc.nextInt();
		// 出力

		boolean boo = false;
		for(int i =a; i<=b; i++){
			if(i % k == 0){
				boo = true;
			}
		}

		if(boo == true){
			System.out.println("OK");
		}
		else{
			System.out.println("NG");
		}

	}
}