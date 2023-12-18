
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) throws IOException
	{
		StreamTokenizer sc=new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		ArrayList<Integer> list=new ArrayList<Integer>();
		sc.nextToken();
		int n=(int) sc.nval;
		data str[]=new data[n];
		for(int i=0;i<n;i++)
		{
			str[i]=new data();
			sc.nextToken();
			str[i].a=(int)sc.nval;
			str[i].b=i+1;
		}
		Arrays.sort(str,new Comparator<data>()
				{
				public int compare(data a,data b)
				{
					if(a.a<b.a)
						return -1;
					else
						return 1;
				}
				});
		for(int i=0;i<n;i++)
			out.print(str[i].b+" ");
		out.flush();
	}

}
class data
{
	int a,b;
}
