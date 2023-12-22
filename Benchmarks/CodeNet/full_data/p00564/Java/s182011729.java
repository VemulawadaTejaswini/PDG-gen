import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)){
			int target = sc.nextInt();
			int xNum = sc.nextInt();
			int xMoney = sc.nextInt();
			int yNum = sc.nextInt();
			int yMoney = sc.nextInt();
			
			int x = target/xNum;
			if (target%xNum!=0) x++;
			x*=xMoney;
			
			int y = target/yNum;
			if (target%yNum!=0) y++;
			y*=yMoney;
			
			System.out.println(Math.min(x, y));
		}
	}
}
