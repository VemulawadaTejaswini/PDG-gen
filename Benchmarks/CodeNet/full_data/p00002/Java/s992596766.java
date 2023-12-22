import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int a,b;
		while(scan.hasNext()){
			a=scan.nextInt();
			b=scan.nextInt();
			System.out.println(Integer.toString(a+b).length());
		}
		scan.close();
	}
}