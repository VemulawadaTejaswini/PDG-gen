import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		doIt();
	}
	
	public static void doIt(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			int ans = 0;
			for(int i = n; i > 1; i--){
				ans += i;
			}
			//System.out.println(ans);
			ans += 2;
			System.out.println(ans);
		}
	}

}