import java.io.*;
class Main
{
    public static void main(String args[])throws IOException
    {
	BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
	String str;
	while((str=input.readLine())!=null)
	    {
		String str_ary[]=str.split(",");
		int a[]=new int[5];
		for(int i=0;i<5;i++)
		    {
			a[i]=Integer.parseInt(str_ary[i]);
		    }
		for(int i=0;i<5;i++)
		    {
			int mini=a[i],x=i;
			for(int j=i;j<5;j++)
			    {
				if(mini>a[j])
				    {
					mini=a[j];
					x=j;
				    }
				
			    }
			int tmp=a[i];
			a[i]=mini;
			a[x]=tmp;
		    }
		
		int count=0;
		for(int i=0;i<5;i++)
		    {
			for(int j=i;j<5;j++)
			    {
				if(a[i]==a[j] && i!=j)
				    {
					count++;
					
				    }
			    }
			
		    }
		if(((a[0]+1==a[1]) && (a[1]+1)==a[2]) && (a[2]+1==a[3]) && (a[3]+1==a[4]))System.out.println("straight");
		else if((a[0]==1) && (a[1]==10) && (a[2]==11) && (a[3]==12) && (a[4]==13))System.out.println("straight");
	else if(count==1)System.out.println("one pair");
	else if(count==2)System.out.println("two pair");
	else if(count==3)System.out.println("three card");
	else if(count==4)System.out.println("full house");
	else if(count==6)System.out.println("four card");
	else System.out.println("null");
	    }
    }
}