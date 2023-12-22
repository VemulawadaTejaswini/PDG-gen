import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] t = sc.next().split("");
		for(int i = 0;i < t.length;i++) {
			if(!t[i].equals("?")) {
				continue;
			}
			// 左隣りがPだったらDにする
			if(i >0 && t[i-1].equals("P")) {
				t[i] = "D";
				continue;
			}
			// 右隣りがDだったらPにする
			if(i <t.length-1 && t[i+1].equals("D")) {
				t[i] = "P";
				continue;
			}
			// それ以外はDにする。
			t[i] = "D";
		}
		StringBuilder answer = new StringBuilder();
		for(String s:t) {
			answer.append(s);
		}
		System.out.println(answer);
	}

}