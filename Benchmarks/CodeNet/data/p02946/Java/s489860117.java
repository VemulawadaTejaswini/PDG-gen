import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		for(int i = -1000000;i <= 1000000;i++){
			if(b-a<i && i < b + a){
				System.out.print(i + " ");
			}
		}
	}

}