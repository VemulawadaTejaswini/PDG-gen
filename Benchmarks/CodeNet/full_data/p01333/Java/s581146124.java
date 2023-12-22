import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static int value, pay;
	public static void main(String[] args) {
		while(read()){
			solve();
		}
	}
	static boolean read(){
		value = sc.nextInt(); pay = sc.nextInt();
		if(value == 0 && pay == 0)
			return false;
		return true;
	}
	static void solve(){
		int n_five = 0, n_handred = 0, n_thousand = 0;
		int diff = pay - value;
		n_thousand = diff / 1000;
		diff = diff % 1000;
		n_five = diff / 500;
		diff = diff % 500;
		n_handred = diff / 100;
		System.out.println(n_handred + " " + n_five + " " + n_thousand);
	}

}