import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int total = sc.nextInt();
		List<Integer> spade = new ArrayList<Integer>();
		List<Integer> heart = new ArrayList<Integer>();
		List<Integer> club = new ArrayList<Integer>();
		List<Integer> diamond = new ArrayList<Integer>();

		for(int i=0;i<total;i++) {
			String symbol = sc.nextLine();
			int number = sc.nextInt();

			if(symbol.equals("S")) {
				spade.add(number);
			}else if(symbol.equals("H")) {
				heart.add(number);
			}else if(symbol.equals("C")) {
				club.add(number);
			}else if(symbol.equals("D")) {
				diamond.add(number);
			}
		}

		for(int i=1;i<=13;i++) {
			if(!(spade.contains(i))) {
				System.out.println("S "+i);
			}
		}
		for(int i=1;i<=13;i++) {
			if(!(heart.contains(i))) {
				System.out.println("H "+i);
			}
		}
		for(int i=1;i<=13;i++) {
			if(!(club.contains(i))) {
				System.out.println("C "+i);
			}
		}
		for(int i=1;i<=13;i++) {
			System.out.println();
			if(!(diamond.contains(i))) {
				System.out.print("D "+i);
			}
		}
	}
}

