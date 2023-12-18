import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Scanner sc=new Scanner(System.in);
		
		//お菓子の個数入力
		int A=sc.nextInt();
		int B=sc.nextInt();
		long snackCnt;
		
		long seiyaku=(long)Math.pow(10, 15);
		
		for(snackCnt=A;snackCnt<seiyaku;snackCnt++) {
			if(snackCnt%A==0&&snackCnt%B==0) {
				System.out.println(snackCnt);
				break;
			}
		}
	
	}

}
