
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) throws IOException
	{
		StreamTokenizer sc=new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		ArrayList<Integer> list=new ArrayList<Integer>();
		sc.nextToken();
		int n=(int) sc.nval;
		for(int i=1;i<=n;i++)
		{
			sc.nextToken();
			list.add((int)sc.nval);
		}
		for(int i=1;i<=n;i++)
			out.print(list.indexOf(i)+1+" ");
		out.flush();
	}

}
