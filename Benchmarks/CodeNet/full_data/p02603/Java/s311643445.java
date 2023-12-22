
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] data = new int[n];
		for(int i = 0; i<n; i++) {
			data[i] = sc.nextInt();
		}
		int money = 1000;
		int least = data[0];
		int most = data[0];
		for(int i = 1; i<n; i++) {
			if(data[i] < most) {
				money = money%least + ((money/least) * most);
				least = data[i];
				most = data[i];
			}
			else {
				if(data[i] > most) {
					most = data[i];
				}
			}
		}
		money = money%least + ((money/least) * most);
		System.out.println(money);
	}
}