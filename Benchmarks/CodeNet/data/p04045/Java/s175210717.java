import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String price = sc.next();
		int pricenum = Integer.parseInt(price);
		int num = sc.nextInt();
		String[] ng = new String[num];
		for(int i = 0; i < num; i++) {
			ng[i] = sc.next();
		}
		boolean isOk = true;

		for(int i = pricenum; i < 100000; i++) {
			for(int j = 0; j < num; j++) {
				if(Integer.toString(i).contains(ng[j])) {
					isOk = false;
					break;
				}
			}
			if(isOk) {
				System.out.println(i);
				return;
			}
			isOk = true;
		}
	}
}