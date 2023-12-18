import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc=new Scanner(System.in);
		
		int s=sc.nextInt();		//羊の数
		int w=sc.nextInt();		//狼の数
		
		if(s<=w) {
			System.out.println("unsafe");
		} else {
			System.out.println("safe");
		}

		sc.close();

	}

}
