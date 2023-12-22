import java.io.*;
class Main
{
    public static void main(String args[])throws IOException
    {
	BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
	String str;
	int a[]=new int[str.length()];
	while((str=input.readLine())!=null)
	    {
	String str_ary[]=new String[str.length()];
	
	for(int i=0;i<str.length();i++)
	    {
		str_ary[i]=""+str.charAt(i);
		if(str_ary[i].equals("I"))a[i]=1;
		if(str_ary[i].equals("V"))a[i]=5;
		if(str_ary[i].equals("X"))a[i]=10;
		if(str_ary[i].equals("L"))a[i]=50;
		if(str_ary[i].equals("C"))a[i]=100;
		if(str_ary[i].equals("D"))a[i]=500;
		if(str_ary[i].equals("M"))a[i]=1000;		
	    }
	int sum=0;
	
	for(int i=0;i<a.length-1;i+=2)
	    {
		
		if(a[i]>=a[i+1])sum+=a[i]+a[i+1];
		if(a[i]<a[i+1])sum+=a[i+1]-a[i];
		
	    }
	if(a.length%2!=0 && a[a.length-1]>a[a.length-2])sum+=a[a.length-1]-a[a.length-2];
	if(a.length%2!=0 && a[a.length-1]<a[a.length-2])sum+=a[a.length-1]+a[a.length-2];
	System.out.println(sum);
	    }
    }
}