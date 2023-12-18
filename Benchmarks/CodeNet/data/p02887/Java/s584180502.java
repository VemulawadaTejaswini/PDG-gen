import java.util.Scanner;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.Arrays;
import java.util.Stack;

public class Main {
		static  Scanner scn=new Scanner(System.in);
		static int count=0;
		public static void main(String[] args) {
			
			int n=scn.nextInt();
			String str=scn.next();
			char ch=str.charAt(0);
			int count=1;
			for(int i=1;i<n;i++)
			{
				if(str.charAt(i)==ch)
					count=count;
				else if(str.charAt(i)!=ch)
				{
					ch=str.charAt(i);
					count++;
				}
			}
			System.out.println(count);
		}
		public static int gcd(int a,int b)
		{
			if(a==0)return b;
			int l= gcd(b%a,a);
			return l;
		}

		
}
