import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Main  implements Runnable {
	Random rnd = new Random();
	public static void main(String[] args) {
		new Thread(null, new Main(), "", 32 * 1024 * 1024).start(); //
	}
	public void run() {
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int n = Integer.parseInt(sc.next());
		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		int[] h = new int[n];
		for (int i = 0; i < n; i++) {
			h[i] = Integer.parseInt(sc.next());
		}
		
		out.println(bs(h, 0, 1000000000, a, b));
		out.flush();
	}
	int bs(int[] ar, int min, int max, int a, int b) {
		int ans = 0;
		if(chk(ar,a,b,min)==true)
		{
			return min;
		}
		if(chk(ar,a,b,max)==false)
		{
			return max;
		}
		int mid= (max+min)/2;;
		while(min+1<max)
		{
			mid = (max+min)/2;
			if(chk(ar,a,b,mid)==false)
			{
				min = mid;
			}
			else {
				max = mid;
			}
		}
		if(chk(ar,a,b,min)==true)
		{
			ans = min;
		}
		else {
			ans = min + 1;
		}
		return ans;
	}
	boolean chk(int[] ar, int a, int b, int m)
	{
		boolean ans = true;
		int n = ar.length;
		long remain = m;
		for (int i = 0; i < n; i++) {
			long tmp = (long)ar[i]-(long)m*(long)b;
			if(tmp>0)
			{
				remain -= (tmp+a-b-1)/(a-b);
			}
		}
		if(remain >= 0)
		{
			ans = true;
		}
		else {
			ans = false;
		}
		return ans;
	}
}