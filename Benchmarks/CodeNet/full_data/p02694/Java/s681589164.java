import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		
		long temp = 100;
		int count = 0;
		while(true) {
			
			if(temp >= x) break;
			
			temp += temp / 100;
			count++;
		}
		
		System.out.println(count);
		
	}

}
