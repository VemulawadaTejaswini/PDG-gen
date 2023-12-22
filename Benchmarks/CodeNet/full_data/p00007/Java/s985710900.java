import java.util.*;
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt();
		long money = 100000;
		
		for(int i=1; i<=n; i++){
			money = (long) (money*1.05);
			if(money % 1000 != 0)
				money = money - money%1000 +1000 ; 
				
		}
		
		System.out.println(money);

	}

}