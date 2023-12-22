/**
 * 
 */
import java.util.*;
/**
 * @author akira
 *
 */
class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int ans = 0;
		while(scan.hasNextLine()){
			String str = scan.nextLine();
			boolean b = true;
			for(int i = 0;i < str.length() / 2;i++){
				if(str.charAt(i) != str.charAt(str.length() - 1 - i)){
					b = false;
				}
			}
			if(b){
				ans++;
			}
		}
		System.out.println("" + ans);
	}

}