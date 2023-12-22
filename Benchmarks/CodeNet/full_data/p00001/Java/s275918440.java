import java.util.Arrays;
import java.util.*;

public class Main {
	public static void main(String [] args)
	{
		int i=0,j=0;
		int a[]=new int[10];
		Scanner scan=new Scanner(System.in);
		for(i=0;i<=9;i++)
			 a[i]=scan.nextInt();
		Arrays.sort(a);
		for(i=0;i<3;i++)
			System.out.println(a[9-i]);
	}

}