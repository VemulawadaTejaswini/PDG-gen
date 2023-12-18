import java.util.Scanner;

public class Main{
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		int W=sc.nextInt();	//横：x座標
		int H=sc.nextInt();	//縦：y座標
		int N=sc.nextInt();	//数列aの長さ

		int x_min=0,x_max=W;	//最終的に求める長方形の横
		int y_min=0,y_max=H;	//最終的に求める長方形の縦

		//最終的に求める長方形の面積
		int sum=0;

		for(int i=1;i<=N;i++){
			int x=sc.nextInt();
			int y=sc.nextInt();
			int a=sc.nextInt();

			if(a==1 && x>x_min) x_min=x;
			else if(a==2 && x<x_max) x_max=x;
			else if(a==3 && y>y_min) y_min=y;
			else if(a==4 && y<y_max) y_max=y;

		}

		//残っている長方形がない場合sumは0
		if(x_max<x_min || y_max<y_min) sum=0;
		else sum=(x_max-x_min)*(y_max-y_min);

		//答えを出力
		System.out.println(sum);
	}
} 