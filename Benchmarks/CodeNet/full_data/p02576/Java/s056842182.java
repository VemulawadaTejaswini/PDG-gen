import java.util.Scanner;
class Test14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		
				
	}

}
