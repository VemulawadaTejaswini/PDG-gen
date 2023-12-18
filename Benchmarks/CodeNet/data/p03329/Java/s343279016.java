import java.util.*;
public class Main {
	public static void main(String[] args){
		strangeBank();
	}
	
	public static void strangeBank() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(strangeBankhelper(n, 0));
	}
	
	public static int strangeBankhelper(int n, int res) {
		if (n < 6) {
			return n + res;
		}
		int ninetemp = 9;
		while (n - ninetemp >= 0) {
			ninetemp *= 9;
		}
		ninetemp /= 9;
		int sixtemp = 6;
		while (n - sixtemp >= 0) {
			sixtemp *= 6;
		}
		sixtemp /= 6;
		return Math.min(strangeBankhelper(n-sixtemp, res+1), strangeBankhelper(n-ninetemp, res+1));
	}
}