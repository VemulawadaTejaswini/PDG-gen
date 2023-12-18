import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		String[] o = sc.next().split("");
		String[] e = sc.next().split("");
		StringBuilder answer = new StringBuilder();
		for(int i = 0; i < e.length;i++) {
			answer.append(o[i]);
			answer.append(e[i]);
		}
		if(o.length > e.length) {
			answer.append(o[o.length -1]);
		}
		System.out.println(answer);
	}

}