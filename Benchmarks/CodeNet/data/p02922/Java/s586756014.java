import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c;
		if((b-1)%(a-1)== 0){
			c = (b-1)/(a-1);
		}
		else{
			c = (b-1)/(a-1) + 1;
		}
		System.out.print(c);
	}

}
