import java.util.Scanner;


public class AISing_20190112 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
		
		int H = sc.nextInt();
		
		int W = sc.nextInt();
		int ans = (N-H+1)*(N-W+1);
		System.out.println(ans);
	}

}