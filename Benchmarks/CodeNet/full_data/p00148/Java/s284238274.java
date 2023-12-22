import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static int candy;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO ツ篠ゥツ督ョツ青カツ青ャツつウツづェツつスツδソツッツドツ・ツスツタツブ
		while(read()){
			slove();
		}
	}
	static boolean read(){
		if(!sc.hasNext())
			return false;
		candy = sc.nextInt();
		return true;
	}
	static  void slove(){
		int ans;
		ans = candy%39;
		System.out.print(3+"C");
		
		if(ans > 0 && ans < 10){
			System.out.print(0);
			System.out.println(ans);
		}else if(ans != 0){
			System.out.println(ans);
		}else{
			System.out.println(39);
		}
	}
}