import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc=new Scanner(System.in);
		
		int s=sc.nextInt();		//羊の数
		int w=sc.nextInt();		//狼の数
		
		if(w<=s) {
			System.out.println("safe");
		} else {
			System.out.println("unsafe");
		}

		sc.close();

	}

}