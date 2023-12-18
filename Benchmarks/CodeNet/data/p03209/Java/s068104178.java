import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
		String burger_ = "";
		String burger = "";
		String level1Burger = "PBPPPB";
		if (N == 1) {
			burger = "BPPPB";
		}else if(N == 0) {
			burger ="P";
		} else {
			for (int i = 0; i < N - 1; i++) {
				burger_ += level1Burger;
			}
			burger = "BBPPPB" + burger_ + "B";
		}

		
		String bunAndPattys[] = burger.split("");
		int eatTotal = 0;
		for (int i = 0; i < X; i++) {
			if(bunAndPattys[i].equals("P")) {
				++eatTotal;
			}
		}
		System.out.println(eatTotal);
	}
}
