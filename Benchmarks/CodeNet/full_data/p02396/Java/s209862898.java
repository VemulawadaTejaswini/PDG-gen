import java.util.Scanner;

public class Main {
	public static Scanner sc;
	
	public static void main(String args[]) {
		//変数の宣言
		int i=1;
		int x[]= new int[10];
		sc = new Scanner(System.in);
		//System.out.println("Please input numbers below");
		//入力
		for(;;){
			x[i]=sc.nextInt();
			if(x[i]==0) {
				break;
			}
			i++;
		}
		i=1;
		//出力
		while(x[i]!=0){
			System.out.printf("Case %d: %d\n",i,x[i]);
			i++;
		}
	}
}

