import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
	    int min = 1000000000, profit = -1000000000;
	    int getNum = scan.nextInt();
	    min = getNum;

		for(int i = 0; i < n-1; i++) {
		 getNum = scan.nextInt();

		 if(profit < getNum-min) {
				profit = getNum-min;
		}

			if(min > getNum) {
				min = getNum;
			}
		}

		System.out.println(profit);
		}
	}
