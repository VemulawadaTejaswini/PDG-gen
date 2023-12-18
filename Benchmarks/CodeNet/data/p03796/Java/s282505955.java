import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		int n = Integer.parseInt(scn.next());
		int res = 1;
		for(int i=1;i<=n;i++){
			res *= i;
			res %= 1000000007;
		}
		System.out.println(res);
	}
}