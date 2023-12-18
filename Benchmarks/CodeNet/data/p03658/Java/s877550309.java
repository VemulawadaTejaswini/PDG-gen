import java.io.*;
import java.util.*;
import java.lang.*;
import static java.lang.System.*;
public class Main
{
public static void main (String args[]) throws Exception
{
	Scanner sc=new Scanner(in);
    int n=sc.nextInt();
    int k=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
    {
	arr[i]=sc.nextInt();
	}
	Arrays.sort(arr);
	long sum=0;
	int count=0;
	for(int i=n-1;i>=0;i--)
	{
		if(count==k) break;
		sum=sum+arr[i];
		count++;
	}
	out.println(sum);
}
}


class Berland
{
char ch;
int pos;
public Berland(int a,char b)
{
ch=b;
pos=a;
}
}
class ChComparator implements Comparator<Berland>
{
public int compare(Berland f1,Berland f2)
{
if(f1.ch==f2.ch)
return 0;
if(f1.ch<f2.ch)
return -1;
return 1;
}
}
