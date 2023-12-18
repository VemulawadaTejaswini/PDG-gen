import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int max;
		if(a+b < a-b){
			max = a-b;
		}
		else{
			max = a+b;
		}
		if(max < a * b){
			max = a * b;
		}

		System.out.println(max);
	}

}
