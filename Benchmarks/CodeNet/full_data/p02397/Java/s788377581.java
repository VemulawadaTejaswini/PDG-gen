import java.util.Scanner;

public class SwappingTwoNumbers {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int count = 0;
		int x = 0;
		int y = 0;
		int setc = 0;
		int [] su = new int[3000];//3000超えない
		for (setc = 0; setc <= 3000; count  +=1) {
			Scanner scan = new Scanner(System.in);
			x = scan.nextInt();//配列に数値を代入
			y = scan.nextInt();//次の配列に数値を代入y
			if (x == 0 && y ==0) {
				break;
			}else {
				su [count] = x;
				su [count++] = y;
				System.out.println(x+" "+y);
			}


			scan.close();
		}

	}
}
