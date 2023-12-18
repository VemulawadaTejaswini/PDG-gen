import java.util.Scanner;

public class Main{
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		int N=sc.nextInt();	//問題数

		int T[]=new int[100];	//それぞれの問題を解くのにかかる時間
		for(int i=0;i<N;i++) T[i]=sc.nextInt();

		int M=sc.nextInt();	//ドリンクの種類

		int sum=0;
		for(int i=0;i<N;i++) sum+=T[i];	//ドリンクを飲まないときの必要な時間

		int sum_drink[]=new int[100];	//ドリンクありの時と無しの時の差

		for(int i=0;i<M;i++){
			int p=sc.nextInt();
			int x=sc.nextInt();
			sum_drink[i]=T[p-1]-x;
		}

		for(int i=0;i<M;i++) System.out.println(sum-sum_drink[i]);
		
	}
} 