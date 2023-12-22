import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int rating = sc.nextInt();

		System.out.println(convertKyu(rating));
	}
	
	private static int convertKyu(int rating) {
		if (rating >= 400 && rating <= 599) {
			return 8;
		}
		if (rating >= 600 && rating <= 799) {
			return 7;
		}
		if (rating >= 800 && rating <= 999) {
			return 6;
		}
		if (rating >= 1000 && rating <= 1199) {
			return 5;
		}
		if (rating >= 1200 && rating <= 1399) {
			return 4;
		}
		if (rating >= 1400 && rating <= 1599) {
			return 3;
		}
		if (rating >= 1600 && rating <= 1799) {
			return 2;
		}
		if (rating >= 1800 && rating <= 1999) {
			return 1;
		}
		
		throw new IllegalArgumentException("レーティングが400未満、または2000以上のため、級位に変換できません。");
	}
}


