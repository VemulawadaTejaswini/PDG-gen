import java.util.Scanner;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.Arrays;
import java.util.Stack;

public class qu {
		static  Scanner scn=new Scanner(System.in);
		static int count=0;
		public static void main(String[] args) {
			
			int n=scn.nextInt();
			int k=scn.nextInt();
			int ans=n-2*k;
			if(ans<0)
				System.out.println("0");
			else
				System.out.println(ans);
		}
		public static int gcd(int a,int b)
		{
			if(a==0)return b;
			int l= gcd(b%a,a);
			return l;
		}

		
}