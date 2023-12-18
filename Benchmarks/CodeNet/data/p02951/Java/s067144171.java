import java.util.Scanner;
public class abc136 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(c-(a-b)<0)
			System.out.print(0);
		else
		    System.out.print(c-(a-b));

	}

}