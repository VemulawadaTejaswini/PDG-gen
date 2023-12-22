import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


class Main
{
		public static void main(String[] args)
		{
			Scanner scan=new Scanner(System.in);
			int n=scan.nextInt();

		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<n;i++)
		{
			Integer num=scan.nextInt();
			list.add(num);
			Collections.reverse(list);
		}


		for(int j=0 ;j<n;j++)
		{
			System.out.print(list.get(j)+" ");
		}
	}
}