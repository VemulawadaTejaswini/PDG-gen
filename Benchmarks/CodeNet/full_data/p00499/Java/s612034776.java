import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int L=sc.nextInt();
		int A=sc.nextInt();
		int B=sc.nextInt();
		int C=sc.nextInt();
		int D=sc.nextInt();
		
		int ans=0;
		int ma, ja;
		ma=A/C;
		if(A%C != 0)ma++;
		
		ja=B/D;
		if(B%D != 0)ja++;
		
		ans = Math.max(ma, ja);
		System.out.println(L-ans);
	}
}