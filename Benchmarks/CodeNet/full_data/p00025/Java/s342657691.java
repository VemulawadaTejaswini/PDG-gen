import java.io.*;
class Main
{
    public static void main(String args[])throws IOException
    {
	BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
	while(true)
	    {
		String str1=input.readLine();
		String str2=input.readLine();
		String str1_ary[]=str1.split(" ");
		String str2_ary[]=str2.split(" ");
		int h=0,b=0;
		for(int i=0;i<str1_ary.length;i++)
		    {
			if(str1_ary[i].equals(str2_ary[i]))h++;
			for(int j=0;j<str2_ary.length;j++)
			    {
				if(!(str1_ary[i]).equals(str2_ary[i]) && (str1_ary[i]).equals(str2_ary[j]))b++;
			    }
		    }
		System.out.println(h+" "+b);
	    }
    }
}