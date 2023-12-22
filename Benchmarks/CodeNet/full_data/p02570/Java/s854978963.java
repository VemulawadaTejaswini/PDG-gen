import java.util.Scanner;
class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int d=sc.nextInt();
		int t=sc.nextInt();
		int s=sc.nextInt();
		int t1=d/s;
		if(t>=t1)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
	}

}