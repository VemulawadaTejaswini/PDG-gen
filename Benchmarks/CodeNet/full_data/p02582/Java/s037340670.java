import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner si=new Scanner(System.in);
		String str;
		
		str=si.next();
		
		char ch[]=str.toCharArray();
		
		int n=str.length(),count=1;
		
		for(int i=0;i<n-1;i++)
		    if(ch[i]=='R' && ch[i+1]=='R')
		        count++;
		    else if(ch[0]=='R' && ch[2]=='R' && count==1||ch[1]=='R' && ch[2]=='S' && count==1|| ch[0]=='R'&& count==1 || ch[2]=='R'&& count==1)
		        count=1;
		    else if(ch[i]!='R' && count==1)
		        count=0;
		
		System.out.println(count);
		si.close();
	}
}
