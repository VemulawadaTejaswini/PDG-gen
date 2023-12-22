import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		num = num % 10;


		if(num==2 || num==4 || num==5 || num==7 || num==9) {
			System.out.println("hon");
		}else if(num == 3) {
			System.out.println("bon");
		}else if(num==0 || num==1 || num==6 || num==8){
			System.out.println("pon");
		}

	}

}
