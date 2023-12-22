import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		for(;;)
		{
			int n=in.nextInt();
			if(n==0)
				return;
			int a[][]=new int[n+1][31];//1次元目の人が空いている2次元目の日
			int b[][]=new int[n][n];//1次元目の人が持ってる2次元目の紙
			int ans=31;
			boolean judge;
			for(int i=0;i<n;i++)
			{
				b[i][i]=1;//自分の持ってる番号
				int f=in.nextInt();
				for(int j=0;j<f;j++)
					a[i][in.nextInt()]=1;
			}
//			for(int i=0;i<n;i++)
//			{
//				for(int j=1;j<30;j++)
//					System.out.print(a[i][j]);
//				System.out.println();
//			}
			int t;
			for(t=1;t<=30;t++)
			{
				LinkedList<Integer> LL=new LinkedList<Integer>();//人
				HashSet<Integer> HS=new HashSet<Integer>();//t日にいる人から集まる紙
				for(int i=0;i<n;i++)//tに空いている人をリストに格納
					if(a[i][t]==1)
						LL.add(i);
				for(int i=0;i<LL.size();i++)
				{
					int k=LL.get(i);//その日いる人のうちの一人
					for(int j=0;j<n;j++)
					{
						if(b[k][j]==1)
						{
							HS.add(j);//j番の紙が集まる
						}
					}
				}
				if(HS.size()==n)
					break;
				//t日にいる人にHSにある紙の情報を与える
				for(int i=0;i<LL.size();i++)
				{
				  	int k=LL.get(i);
				  	Iterator it = HS.iterator();
				  	while (it.hasNext()) 
				  	{
				  		int I=(Integer) it.next();
			            b[k][I]=1;
				  	}
				}
			}
			System.out.println(t>30 ? -1:t);
		}
	}
}