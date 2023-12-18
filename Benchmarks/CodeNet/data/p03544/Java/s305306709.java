import java.util.Scanner;
public class Main{

	static int []a;
	static int ans;
	static int count;
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);		//入力
		int n = sc.nextInt();				//入力したのをint型に変換
		sc.close();
		int a0 = 2;
		int a1 = 1;
		int a2 = 0;
		for(int i = 0;i <= n-2;i++){
			a2 = a0 + a1;
			a0 = a1;
			a1 = a2;
					
		}
		System.out.println(a2);
	}



}
