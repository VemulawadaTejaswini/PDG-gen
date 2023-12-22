import java.util.Scanner;


public class Main {

	static Scanner sc = new Scanner(System.in);
	
	static int day, m, d;
	static int month[] = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	static String week[] = {"Wednesday", "Thursday", "Friday", "Saturday", "Sunday", "Monday", "Tuseday"};
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		while(read()){
			solve();
		}

	}
	
	static boolean read(){
		
		m = sc.nextInt();
		d = sc.nextInt();
		
		if(m == 0) return false;
		
		return true;
	}
	
	static void solve(){
		
		day = d;
		
		for(int i=1; i <= m-1; i++){
			day += month[i-1];
		}
		
		day %= 7;
		System.out.println(week[day]);
	}

}