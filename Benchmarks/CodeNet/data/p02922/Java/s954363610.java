import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			int b = sc.nextInt();
			//int c = 1;
			if(b%(a-1)>=2) {
				System.out.println(b/(a-1)+1);
			}else {
			System.out.println(b/(a-1));
			}
			sc.close();
	}

}