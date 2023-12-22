import java.io.*;
class Main
{
    public static void main(String args[])throws IOException
    {
	BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
	String str;
	int a[]=new int[3];
	a[0]=1;
	char ans='\u0000';
	while((str=input.readLine())!=null)
	    {
		int x=0,y=0;
		String str_ary[]=str.split(",");
		if(str_ary[0].equals("A"))x=0;
		if(str_ary[0].equals("B"))x=1;
		if(str_ary[0].equals("C"))x=2;
		if(str_ary[1].equals("A"))y=0;
		if(str_ary[1].equals("B"))y=1;
		if(str_ary[1].equals("C"))y=2;
		if(a[x]==1 || a[y]==1)
		    {
			int tmp=a[x];
			a[x]=a[y];
			a[y]=tmp;
		    }
		for(int i=0;i<3;i++)
		    {
			if(a[0]==1)ans='A';
			if(a[1]==1)ans='B';
			if(a[2]==1)ans='C';
		    }
		System.out.println(ans);
	    }
	System.out.println(ans);
    }
}