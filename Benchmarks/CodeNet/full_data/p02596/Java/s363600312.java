import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Scanner sc = new Scanner (System.in);
		
		int k = sc.nextInt();
		int seven = 7;
		
		for(int i=1;i<=k;i++) {
			if(seven%k==0) {
				System.out.println(i);
				return;
			}
			seven=seven*10+7;
		}
		System.out.println(-1);		

	}

}