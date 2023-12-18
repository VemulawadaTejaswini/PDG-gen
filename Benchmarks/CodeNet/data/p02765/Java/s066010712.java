import java.util.Scanner;

public class Main.java {

	public static void main(String[] args) {
		Scanner sc01 = new Scanner(System.in);
		Scanner sc02 = new Scanner(System.in);
		System.out.println("参加回数");
		int joining = sc01.nextInt();
		System.out.println("表示レーティング");
		int displayRating = sc02.nextInt();

		if(joining < 10 ){
			int result = 100*(10-joining);
			int results01 = displayRating + result;
			System.out.println("内部レーティングは" + results01);
		}else{
			System.out.println("内部レーティングは" + displayRating);
		}
		sc01.close();
		sc02.close();
	}
  }