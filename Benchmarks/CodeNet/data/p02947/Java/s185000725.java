import java.io.*;
import java.util.*;
public class Main
{
	static int isAnagram(String s1, String s2) 
	{   
        boolean status = true;   
            char[] ArrayS1 = s1.toCharArray();  
            char[] ArrayS2 = s2.toCharArray();  
            Arrays.sort(ArrayS1);  
            Arrays.sort(ArrayS2);  
            status = Arrays.equals(ArrayS1, ArrayS2);   
        if (status) 
		{  
            return 1;  
        } 
		else 
		{  
            return 0;  
        }  
    }
	public static void main(String args[])
	{
		Scanner x=new Scanner(System.in);
		int c=0;
    	int n=x.nextInt();
		String k[]=new String[n];
		for(int i=0;i<n;i++)
		{
			k[i]=x.next();
		}
		for(int i=0;i<n-1;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				c+=isAnagram(k[i],k[j]);
			}
		}
		System.out.println(c);
	}
}