import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);

		int D = sc.nextInt();
		String Chr = "Christmas";

		if(D == 25) {
			Chr = "Christmas";
		}else if(D == 24){
			Chr = "Christmas Eve";
		}else if(D == 23){
			Chr = "Christmas Eve Eve";
		}else if(D == 22){
			Chr = "Christmas Eve Eve Eve";
		}





		System.out.println(Chr);




	}

}