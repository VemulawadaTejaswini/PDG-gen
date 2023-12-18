import java.util.Scanner;
public class  Main

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int n = stdIn.nextInt();
		int m = stdIn.nextInt();
		
		
		//偶＋偶
		//奇＋奇
		
		int cnt = 0;
		
		cnt += (n*(n-1))/2;
		cnt += (m*(m-1))/2;

		System.out.println(cnt);


	}

}
