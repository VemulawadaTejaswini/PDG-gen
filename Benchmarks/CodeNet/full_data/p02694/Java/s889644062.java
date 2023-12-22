import java.util.*;

public class Main {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		long X = sc.nextLong();
		long money = 100;
		int i = 0;
		if (X < 1333333333) {
			while (money < X) {
				money *= 1.01;
				i++;
			}
		} else {
			i = 1706;
			money = 1333333333;
			while (money < X) {
				money *= 1.01;
				i++;
			}
		}
		System.out.println(i);
	}
}