import java.util.Scanner;

public class Main {
	public static int ceil(int a, int b){
		int x = (a + (b - 1))/b;
		return x;
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long N = sc.nextInt();
		long ans;
		ans = N*(N-1)/2;
		// 出力
		System.out.println(ans);
	