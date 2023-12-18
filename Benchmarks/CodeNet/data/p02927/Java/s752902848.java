import java.util.*;
import java.util.ArrayList;


public class Main{
	public static void main(String args[]){

		// 値を取得
		Scanner sc = new Scanner(System.in);
		ArrayList<String> ymd = new ArrayList<>();
		int M = sc.nextInt();
		String D = sc.next();
		int DNUM = Integer.parseInt(D); 
		int cnt = 0;
		//System.out.println(d1 + d10);

		// 月分回す
		for(int i= 1;i<=M;i++){
			// 日数分回す
			for(int j=1;j<=DNUM;j++){

				// 桁数チェック
				if(j < 10){
					continue;
				}

				// 桁の積を計算
				int d1 = Integer.parseInt(String.valueOf(j).substring(0,1));
				int d10 = Integer.parseInt(String.valueOf(j).substring(1,2));
				int pr = d1 * d10;
				// 条件チェック
				if(d1 >= 2 && d10 >= 2 && pr == i){
					cnt++;
				}
			}
		}

		System.out.println(cnt);
	}
}