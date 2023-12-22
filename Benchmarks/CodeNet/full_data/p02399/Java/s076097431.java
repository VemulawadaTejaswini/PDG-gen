import java.util.Scanner;

class Main
{
	public static void main(String[] args)
	{
	Scanner sc1 = new Scanner(System.in);//入力
	int a = sc1.nextInt();
	int b = sc1.nextInt();
	int d = a / b;
	int r = a % b;
	double f = (double)a / b;//(double)がないとintで出る
	System.out.println(d+" "+r+" "+String.format("%.5f", f));//表示形式
	}
}

