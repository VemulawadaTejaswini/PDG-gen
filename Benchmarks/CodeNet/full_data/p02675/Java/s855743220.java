import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan =new Scanner(System.in);
		int n =scan.nextInt();
		int a=0;
		int b=0;
		int sum=0;
		if(n>=10&&n<100) {
			sum=n%10;
		}
		else if(n>=100) {
			a=n%100;
			sum=a%10;
		}
		else {
			sum=n;
		}
		
		
		
		if(sum==2||sum==4||sum==5||sum==7||sum==9) {
			System.out.println("hon");
		}
		else if(sum==0||sum==1||sum==6||sum==8) {
			System.out.println("pon");
		}
		else if(sum==3) {
			System.out.println("bon");
		}
	}

}
