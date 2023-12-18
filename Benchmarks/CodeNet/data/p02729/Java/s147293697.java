import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class INTEST
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		/*Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		for(int i=0;i<T;i++)
		{
		    String a=sc.next();
		    int length=a.length();
		    if(length%2==0){
		        String part1="",part2="";
		        int n=length/2;
		        //for part 1;
		        for(int j=0;j<n;j++)
		        {
		            part1=part1+a.charAt(j);
		        }
		        //for part2
		        for(int j=n;j<length;j++)
		        {
		            part2=part2+a.charAt(j);
		        }
		        //System.out.println(""+part1+" "+part2);
		        //unicode for part1
		        int count1=0,count2=0;
		        for(int j=0;j<part1.length();j++)
		        {
		            count1=count1+(int)(part1.charAt(j));
		        }
		        for(int j=0;j<part2.length();j++)
		        {
		            count2=count2+(int)(part2.charAt(j));
		        }
		        //System.out.println(count1+" "+count2);
		        if(count1==count2)
		        {
		            System.out.println("YES");
		        }
		        else
		        {
		            System.out.println("NO");
		        }
		    }
		    else{
		        String part1="",part2="";
		        int n=(int)(length/2);
		        //for part 1;
		        for(int j=0;j<n;j++)
		        {
		            part1=part1+a.charAt(j);
		        }
		        //for part2
		        for(int j=n+1;j<length;j++)
		        {
		            part2=part2+a.charAt(j);
		        }
		        //System.out.println(""+part1+" "+part2);
		        int count1=0,count2=0;
		        for(int j=0;j<part1.length();j++)
		        {
		            count1=count1+(int)(part1.charAt(j));
		        }
		        for(int j=0;j<part2.length();j++)
		        {
		            count2=count2+(int)(part2.charAt(j));
		        }
		        //System.out.println(""+count1+" "+count2);
		        if(count1==count2)
		        {
		            System.out.println("YES");
		        }
		        else
		        {
		            System.out.println("NO");
		        }
		    }
		}
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		for(int i=0;i<T;i++)
		{
		    String a=sc.next();
		    int length=a.length();
		    if(length%2==0)
		    {
		        int n=length/2;
		        String part1=a.substring(0,n);
		        String part2=a.substring(n,length);
		        int count1=0,count2=0;
		        for(int j=0;j<part1.length();j++)
		        {
		            count1=count1+(int)(part1.charAt(j));
		        }
		        for(int j=0;j<part2.length();j++)
		        {
		            count2=count2+(int)(part2.charAt(j));
		        }
		        if(count1==count2)
		        System.out.println("YES");
		        else
		        System.out.println("NO");
		    }
		    else{
		        int n=(int)(length/2);
		        String part1=a.substring(0,n);
		        String part2=a.substring(n+1,length);
		        int count1=0,count2=0;
		        for(int j=0;j<part1.length();j++)
		        {
		            count1=count1+(int)(part1.charAt(j));
		        }
		        for(int j=0;j<part2.length();j++)
		        {
		            count2=count2+(int)(part2.charAt(j));
		        }
		        if(count1==count2)
		        System.out.println("YES");
		        else
		        System.out.println("NO");
		    }
		}*/
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int flag=1;
		String temp="";
		int N=s.length();
		// to check if palindrome;
		for(int i=N-1;i>=0;i--)
		{
			char a=s.charAt(i);
			temp=temp+a;
		}
		if(temp.equals(s))
		{
			flag=1;
		}
		else
			flag=0;
		System.out.print(flag);
		// 2nd condition
		
		int end=(int)((N-1)/2);
		String temp2="";
		temp="";
		for(int i=0;i<end;i++)
		{
			temp2=temp2+s.charAt(i);
		}
		for(int i=end-1;i>=0;i--)
		{
			temp=temp+s.charAt(i);
		}
		if(temp2.equals(temp))
		{
			flag=1;
		}
		else
			flag=0;
		System.out.print(flag);
		//check for 3rd condition
		end=(int)((N+3)/2);
		temp2="";
		temp="";
		for(int i=end-1;i<=N-1;i++)
		{
			temp2=temp2+s.charAt(i);
		}
		for(int i=N-1;i>=end-1;i--)
		{
			temp=temp+s.charAt(i);
		}
		if(temp2.equals(temp))
		{
			flag=1;
		}
		else
			flag=0;
		System.out.print(flag);
		//condition check for strong palindrome
		if(flag==1)
		{
			System.out.println("Yes");
			
		}
		else
		{
			System.out.println("No");
		}
}
}

