import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		boolean isY = false;
		for(int i = 0; i < N; i++) {
			String S = sc.next();
			if(S.equals("Y")) isY = true;
		}
		System.out.println(isY ? "Four" : "Three");
	}
}
