import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc=new Scanner(System.in);

		int n=sc.nextInt();
	    int a=n/100;	//100の位
		int b=(n/10)%10;	//10の位
		int c=n%10;			//1の位
		
		if(a==7||b==7||c==7) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		sc.close();
	}

}
