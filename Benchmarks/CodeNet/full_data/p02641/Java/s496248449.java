//package ABC170;
import java.util.*;
import java.io.*;
import java.lang.*;
class Main {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int x=sc.nextInt();
		int n=sc.nextInt();
		HashSet<Integer> hs=new HashSet<>();
		for(int i=0;i<n;i++)
		{
			hs.add(sc.nextInt());
		}
		if(hs.contains(x)==false)
		{
			System.out.println(x);
			return;
		}
		int num1=x-1;
		int num2=x+1;
		while(true)
		{
			if(hs.contains(num1)==false)
			{
				System.out.println(num1);
				return;
			}
			else
			{
				num1--;
			}
			if(hs.contains(num2)==false)
			{
				System.out.println(num2);
				return;
			}
			else
			{
				num2++;
			}
		}

	}

}
