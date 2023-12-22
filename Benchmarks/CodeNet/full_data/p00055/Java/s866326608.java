/**
 * 
 */
import java.util.*;
/**
 * @author afterCmidday
 *
 */
class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		while(scan.hasNextDouble()){
			double a = scan.nextDouble(), ans = a;
			for(int i = 0;i < 4;i++){
				a *= 2;
				ans += a;
				a /= 3;
				ans += a;
			}
			a *= 2;
			ans += a;
			System.out.println("" + ans);
		}
		
	}

}