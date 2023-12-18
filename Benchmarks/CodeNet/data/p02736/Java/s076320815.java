

import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		int[] a = new int[n];
		boolean d1 = false;
		int[] d = new int[n-1];
		for(int i = 0; i < s.length(); i++)
		{
			a[i] = s.charAt(i)-'0';
			if(i>0)
			{
				d[i-1] = a[i]-a[i-1];
				if(d[i-1]<0)d[i-1]*=-1;
				if(d[i-1] == 1)d1 = true;
			}
		}
		int m = n-1, t1 = 0, t2 = 0;
		
		for(int take = 0; take <= m-1; take++)
		{ //(m-1) C take 0
			int nn = m-1;
			boolean odd = ((nn) & ((nn)-take)) <= 0;
			odd = (take & (nn-take)) <= 0;
			if(d[take] == 1 && odd)t1++;
			if(d[take] == 2 && odd)t2++;
		}
		
		t1 = t1%2;
		t2 = t2%2;
		if(t1<0)t1+=2;if(t2<0)t2+=2;
		if(t1 == 0 && t2 == 0)
			System.out.println(0);
		else if(t2 == 1 && t1 == 0)
			if(!d1) System.out.println(2);
			else System.out.println(0);
		else System.out.println(1);
		
	}

}
