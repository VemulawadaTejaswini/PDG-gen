//package ABC171;
import java.util.*;
import java.io.*;
class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		long n=sc.nextLong();
		
		char ch[]=new char[27];
		for(int i=1;i<=26;i++)
		{
			ch[i]=(char)('a'+i-1);
		}
		
		StringBuffer bf =new StringBuffer("");
		
		while(n>0)
		{
			int mod=(int)n%26;
			if(n%26==0)
			{
				bf.append('z');
				n=n/26-1;
			}
			else
				{
				
				bf.append(ch[mod]);
				n=n/26;
				}
			
		}
		bf.reverse();
		System.out.println(bf.toString());
		//System.out.println(Arrays.toString(ch));
		

	}

}
