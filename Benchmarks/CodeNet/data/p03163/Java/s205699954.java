import java.awt.Point;
import java.io.*;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;
import java.util.TreeSet;

import javax.swing.event.TreeSelectionEvent;
import javax.swing.plaf.basic.BasicTreeUI.TreeCancelEditingAction;

import org.omg.PortableInterceptor.INACTIVE;
public class Main {


public static void D(BufferedReader br)throws Exception
{
	String in = br.readLine();
	StringTokenizer st=new StringTokenizer(in);
	int n=Integer.parseInt(st.nextToken());
	int W=Integer.parseInt(st.nextToken());
	long[][]ks=new long [n+1][W+1];
	int[]items=new int[n+1];
	int[]weights=new int[n+1];
	int sw=0;
	long sv=0;
	for(int i=1;i<n+1;i++)
	{
		in=br.readLine();
		st=new StringTokenizer(in);
		weights[i]=Integer.parseInt(st.nextToken());
		items[i]=Integer.parseInt(st.nextToken());
		sw+=weights[i];
		sv+=items[i];
				
	}
	if(sw<=W)
	{
		System.out.println(sv);
		return;
	}
	
	for(int i=1;i<n+1;i++)
	{
		for(int w=1;w<W+1;w++)
		{
			long not=ks[i-1][w];
			long take=0;
			if(weights[i]<=w)
			{
				take=items[i]+ks[i-1][w-weights[i]];
			}
			ks[i][w]=Math.max(not, take);
		}
	}
	System.out.println(ks[n][W]);
}
public static void main(String[]args) throws Exception
{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	D(br);

	
}
	
}
