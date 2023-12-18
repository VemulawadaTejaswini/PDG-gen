import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inputK = sc.next();
		String inputA = sc.next();
		String inputB = sc.next();

		int actionPoint = Integer.parseInt(inputK);
		int biscuitToMoneyRate = Integer.parseInt(inputA);
		int moneyToBiscuitRate = Integer.parseInt(inputB);

		int money = 0;
		int biscuit = 1;

		for(int i = 1; i <= actionPoint; i++) {
			if(money >= 1) {
				money -= 1;
				biscuit += moneyToBiscuitRate;
			}else if(moneyToBiscuitRate - biscuitToMoneyRate >= 3) {
				int remainingAP = actionPoint - i + 1;
				if(remainingAP >= 2) {
					if((remainingAP - 1) - (biscuitToMoneyRate - biscuit) > 0) {
						if(biscuit >= biscuitToMoneyRate) {
							biscuit -= biscuitToMoneyRate;
							money += 1;
						}else {
							biscuit += 1;
						}
					}else {
						biscuit += 1;
					}
				}else {
					biscuit += 1;
				}
			}else {
				biscuit += 1;
			}
		}

		System.out.println(biscuit);
		sc.close();
	}
}
