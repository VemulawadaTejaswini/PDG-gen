import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		int[] a=new int[100];
		Scanner scan = new Scanner(System.in);
		for(int i=0;a[i]==0;i++)
		{
			a[i]= Integer.parseInt(scan.next());
			System.out.println("case "+i+": "+a[i]);
		}
	}

}