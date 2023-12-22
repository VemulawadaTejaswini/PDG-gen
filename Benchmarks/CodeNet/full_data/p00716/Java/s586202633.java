import java.util.Scanner;

public class Main {

	private void doit() {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		while(m-- > 0){
			int start = sc.nextInt();
			int year = sc.nextInt();
			int n = sc.nextInt();
			int ans = 0;
			while(n-- > 0){
				int digit = sc.nextInt();
				Double profit = sc.nextDouble();
				int charge = sc.nextInt();
				int money = start;
				if(digit == 1){
					for(int i=0; i < year; i++){
						money =  (int)(money * (1.0 + profit)) - charge;
					}
				}
				else{
					int sumprofit = 0;
					for(int i=0; i < year; i++){
						sumprofit += (int)(money * profit);
						money -= charge;
					}
					money += sumprofit;
				}
				ans = Math.max(ans, money);
			}
			System.out.println(ans);
		}
	}

	public static void main(String[] args) {
		Main obj = new Main();
		obj.doit();
	}

}