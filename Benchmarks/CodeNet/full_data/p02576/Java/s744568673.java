import java.util.Scanner;
class Main {

	public static void main(String[] args)
    {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int x=sc.nextInt();
		int t=sc.nextInt();
		int time=t;
		int x1=x;
		while(x<n)
		{
			t=t+time;
			x=x+x1;
		}
		System.out.println(t);
		
		sc.close();		
	}

}
