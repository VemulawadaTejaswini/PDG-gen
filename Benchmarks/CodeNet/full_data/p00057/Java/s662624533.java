import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static int n;
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
		n = sc.nextInt();
		return true;
	}
	static void slove(){
		int ans = n*(n+1)/2 + 1;
		System.out.println(ans);
	}
}