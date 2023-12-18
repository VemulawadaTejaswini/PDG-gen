import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long X = sc.nextLong();
		String burger_ = "";
		String burger = "";
		String level1Burger = "PBPPPB";
		if (N == 1) {
			burger = "BPPPB";
		} else {
			for (int i = 0; i < N - 1; i++) {
				burger_ += level1Burger;
			}
			burger = "BBPPPB" + burger_ + "B";
		}

		
		String bunAndPattys[] = burger.split("");
		long eatTotal = 0;
		for (long i = 0; i < X; i++) {
			if(bunAndPattys[(int) i].equals("P")) {
				++eatTotal;
			}
		}
		System.out.println(eatTotal);
	}
}
