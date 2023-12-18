import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();//割る数
		int c = sc.nextInt();//余り
		int check1 = a % 2;
		int check2 = c % 2;
		int check3 = b % 2;
		if(check1 == check2){
			if(check1 == check3){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
		}else{
			System.out.println("NO");
		}

	}

}