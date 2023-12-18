import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		char[] c = scanner.nextLine().toCharArray();
		int answer = 0;
		while(true) {
			boolean flag = false;
			for(int i = 0;i<c.length - 1;i++) {
				if(c[i]== 'B' && c[i + 1] == 'W') {
					c[i] = 'W';
					c[i + 1] = 'B';
					flag = true;
					answer ++ ;
				}
			}
			if(!flag) break;
		}
		
		System.out.println(answer);
	}

}
