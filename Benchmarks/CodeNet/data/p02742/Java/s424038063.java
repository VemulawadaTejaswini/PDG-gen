import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		long numberH = sc.nextInt();
		long numberW = sc.nextInt();
		sc.close();

		long answer = 0;
		if(numberW == 1 || numberH == 1) {
			answer = 1;
		}else {
				if(numberH % 2 ==1) {
					answer = (numberH * numberW +1) /2 ;
				}else {
					answer = (numberH * numberW)/2;
				}
			}
		System.out.println(answer);
	}

}
