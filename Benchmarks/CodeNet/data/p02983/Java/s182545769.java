import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c=(b-a)%2019;
		a = a % 2019;
		b = a + c;
		int min = a * (a + 1) % 2019;
		for(int i = a; i <= b; i++){
			for(int j = i + 1; j <= b; j++){
				if(i * j % 2019 < min){
					min = i * j % 2019;
				}
			}
		}
		System.out.println(min);

	}

}