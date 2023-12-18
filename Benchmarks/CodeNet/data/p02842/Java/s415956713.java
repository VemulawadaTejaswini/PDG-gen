import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		String ans = ":(";
		for(int i = 0;i < N;i++) {
			if(N == Math.floor(i*1.08))ans = "" + i;
		}
		System.out.println(ans);
	}

}
