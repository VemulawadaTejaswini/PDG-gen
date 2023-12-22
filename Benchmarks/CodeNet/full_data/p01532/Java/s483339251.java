import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt(),T=sc.nextInt(),H=sc.nextInt(),L=sc.nextInt();
		int[] t = new int[N],h = new int[N];
		for(int i=0;i<N;i++)
		{t[i]=sc.nextInt(); h[i]=sc.nextInt();}
		sc.close();

		int i=0;
		while (true)
		{
			//10円玉を払う場合
			if(t[i]>0)
			{
				t[i]--;T++;
				//10円ストレージの上限を超えると自販機が壊れる
				if(T>L) {break;}
			}
			//100円玉を払う場合
			else if(h[i]>0)
			{h[i]--;H++;}
			//所持金が無い場合は勝利
			else {break;}

			//90円以上で飲み物とお釣りが払われる
			if(T+10*H>=9)
			{
				//お釣りを払えないと壊れる
				if(H>0)
				{break;}
				else
				{t[i] += T-9; T=0;}
			}
			i = (i+1)%N;
		}
		System.out.println(i+1);
	}
}