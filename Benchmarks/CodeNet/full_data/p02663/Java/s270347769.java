import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt(); //時
		int b = scan.nextInt(); //分
		int c = scan.nextInt();
		int d = scan.nextInt();
		int k = scan.nextInt(); //勉強時間
		int m1 = c -a;
		//おきてから寝るまで
		int m2;
		if(d >= b) {
			m2 = d - b;
		} else {
			m2 = 60 - (d - b);
			m1--;
		}
		int h = m1 * 60 + m2 - k;
		System.out.println(h);
		
	}

}