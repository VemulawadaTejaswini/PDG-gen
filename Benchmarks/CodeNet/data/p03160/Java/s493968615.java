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

public static void A(BufferedReader br)throws Exception
{
	String in=br.readLine();
	StringTokenizer st= new StringTokenizer(in);
	int n=Integer.parseInt(st.nextToken());
	ArrayList<Integer> path=new ArrayList<>();
	in=br.readLine();
	st=new StringTokenizer(in);
	for(int i=0;i<n;i++)
	{
		path.add(Integer.parseInt(st.nextToken()));
	
	}
	
	System.out.println((helper(path,0,0)+1));
}
public static int helper(ArrayList<Integer>a,int pos,int acc)
{
	if(pos>=a.size())
		return acc;
	int acc1=getAcc(a,pos,pos+1);
	int acc2=getAcc(a,pos,pos+2);
	if(acc2!=-1)
	return Math.min(helper(a,pos+1,acc+acc1) , helper(a,pos+2,acc+acc2));
	else
	return helper(a,pos+1,acc+acc1);	
}
public static int getAcc(ArrayList<Integer>a,int p,int k) 
{
	
	if(k>=a.size())
	{
		return -1;
	}
	return Math.abs(a.get(p)-a.get(k));
}
public static void main(String[]args) throws Exception
{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	A(br);

	
}
	
}
