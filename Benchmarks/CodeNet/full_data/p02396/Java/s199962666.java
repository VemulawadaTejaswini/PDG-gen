import java.util.Scanner;

public class Main {
	public static Scanner sc;
	
	public static void main(String args[]) {
		//変数の宣言
		int i=1;
		int x=0;
		sc = new Scanner(System.in);
		//System.out.println("Please input numbers below");
		//入力と出力
		for(;;){
			x=sc.nextInt();
			System.out.printf("Case %d: %d\n",i,x);
			if(x==0) {
				break;
			}
			i++;
		}
	}
}
