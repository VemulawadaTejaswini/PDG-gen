import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main 
{
	static int n;
	static long w;
	static ArrayList<Long> w1 = new ArrayList<Long>();
	static ArrayList<Long> w2 = new ArrayList<Long>();
	static ArrayList<Long> w3 = new ArrayList<Long>();
	static ArrayList<Long> w4 = new ArrayList<Long>();

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		w = sc.nextLong();
		
		long w0 = 0;
		for(int i = 0; i < n; i++)
		{
			long wt = sc.nextLong();
			long val = sc.nextLong();
			
			if(i==0)w0=wt;
			if(wt==w0)w1.add(val);
			else if(wt==w0+1)w2.add(val);
			else if(wt==w0+2)w3.add(val);
			else if(wt==w0+3)w4.add(val);
		}
		
		w1.sort(Collections.reverseOrder());
		w2.sort(Collections.reverseOrder());
		w3.sort(Collections.reverseOrder());
		w4.sort(Collections.reverseOrder());
		
		int n1 = w1.size();
		int n2 = w2.size();
		int n3 = w3.size();
		int n4 = w4.size();
		long[] s1 = new long[n1+1];
		long[] s2 = new long[n2+1];
		long[] s3 = new long[n3+1];
		long[] s4 = new long[n4+1];
		
		for(int i = 0; i < n1; i++)
		{
			s1[i+1] = w1.get(i) + s1[i];
		}
		for(int i = 0; i < n2; i++)
		{
			s2[i+1] = w2.get(i) + s2[i];
		}
		for(int i = 0; i < n3; i++)
		{
			s3[i+1] = w3.get(i) + s3[i];
		}
		for(int i = 0; i < n4; i++)
		{
			s4[i+1] = w4.get(i) + s4[i];
		}
		
		long best = 0;
		for(int i1 = 0; i1 <= n1 && w0*i1 <= w; i1++)
			for(int i2 = 0; i2 <= n2 && w0*i1+(w0+1)*i2 <= w; i2++)
				for(int i3 = 0; i3 <= n3 && w0*i1+(w0+1)*i2+(w0+2)*i3 <= w; i3++)
					for(int i4 = 0; i4 <= n4 && w0*i1+(w0+1)*i2+(w0+2)*i3+(w0+3)*i4 <= w; i4++)
					{
						best = Math.max(best, s1[i1]+s2[i2]+s3[i3]+s4[i4]);
					}
		
		System.out.println(best);
		
	}

}
