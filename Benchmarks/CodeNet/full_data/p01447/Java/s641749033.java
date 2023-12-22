import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int i=1;
		for(;;) {
			if(n<=Math.pow(3, i)) {
				break;
			}
			i++;
		}
		System.out.println(i);
		
		sc.close();
	}

}

