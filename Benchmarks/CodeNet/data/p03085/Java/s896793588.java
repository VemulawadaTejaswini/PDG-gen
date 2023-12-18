import java.util.Scanner;


public class Main {


	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ


		Scanner sc = new Scanner(System.in);
		String S = sc.next();

		String res;
		if(S.equals("A")) {
			res = "T";
		}else if(S.equals("G")) {
			res = "C";
		}else if(S.equals("C")) {
			res = "G";
		}else  {
			res = "A";
		}
		System.out.println(res);


		}


}