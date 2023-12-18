import java.util.*;
public class Main {
	public static void main(String[] args)
	{
		//変数
		int count=0;
		boolean sw=false;
		int answer=0;
		//List<Integer> hb=new ArrayList<Integer>();
		//long a=0;
		int hi=0;
		//入力
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		int H=sc.nextInt();
		int W=sc.nextInt();
		//int [][] cost =new int[N-1][2];
		//処理
		int a=N-H+1;
		int b=N-W+1;
		answer=a*b;
		// 出力
		System.out.println(answer);
	}
}