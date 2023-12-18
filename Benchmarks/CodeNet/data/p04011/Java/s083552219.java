
public class Main {
	public static void main(String[] args) {
		int[] num = new int[4];
		int money = 0;
		for (int i = 0; i < 4; i++) {
			num[i] = new java.util.Scanner(System.in).nextInt();
		}
		money = num[1]*num[2]+num[3]*(num[0]-num[1]);

		System.out.println(money);
	}
}