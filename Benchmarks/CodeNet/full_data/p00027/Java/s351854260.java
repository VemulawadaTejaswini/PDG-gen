import java.io.*;
class Main
{
    public static void main(String args[])throws IOException
    {
	BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
	String str;
	while(true)
	    {
		str=input.readLine();
		int a[]=new int[2];
		String ary[]=str.split(" ");
		if(ary[0].equals("0") && ary[1].equals("0"))break;
		for(int i=0;i<2;i++)
		    {
			a[i]=Integer.parseInt(ary[i]);
		    }
		int day=0,j=31,f=29+j,mr=31+f,ap=30+mr,my=31+ap,jn=30+my,jl=31+jn,au=31+jl,s=30+au,o=31+s,n=30+o;
		if(a[0]==1)day=a[1];
		else if(a[0]==2)day=j+a[1];
		else if(a[0]==3)day=f+a[1];
		else if(a[0]==4)day=mr+a[1];
		else if(a[0]==5)day=ap+a[1];
		else if(a[0]==6)day=my+a[1];
		else if(a[0]==7)day=jn+a[1];
		else if(a[0]==8)day=jl+a[1];
		else if(a[0]==9)day=au+a[1];
		else if(a[0]==10)day=s+a[1];
		else if(a[0]==11)day=o+a[1];
		else if(a[0]==12)day=n+a[1];
		if(day%7==1)System.out.println("Thursday");
		else if(day%7==2)System.out.println("Friday");
		else if(day%7==3)System.out.println("Saturday");
		else if(day%7==4)System.out.println("Sunday");
		else if(day%7==5)System.out.println("Monday");
		else if(day%7==6)System.out.println("Tuesday");
		else if(day%7==0)System.out.println("Wednesday");
		
	    }
    }
}