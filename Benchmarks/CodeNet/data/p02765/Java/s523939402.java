import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("参加回数");
		int joining = sc.nextInt();
		System.out.println("表示レーティング");
		int displayRating = sc.nextInt();

		if(joining < 10 ){
			int result = 100*(10-joining);
			int results01 = displayRating + result;
			System.out.println("内部レーティングは" + results01);
		}else{
			System.out.println("内部レーティングは" + displayRating);
		}
		sc.close();
		}
  }