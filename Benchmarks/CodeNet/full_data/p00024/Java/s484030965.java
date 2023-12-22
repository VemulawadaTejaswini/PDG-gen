import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static double v, t, y;
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
		if(!sc.hasNextDouble())
			return false;
		
		v = sc.nextDouble();
		return true;
	}
	static void slove(){
		/**
		 * v = 9.8*t
		 * y = 4.9*t^2
		 * ツづヲツづィ
		 */
		t = v/9.8;
		y = 4.9*t*t;
		//System.out.println(y);
		int N = 0;
		while(5*N-5 < y){
			N++;
		}
		System.out.println(N);
	}

}