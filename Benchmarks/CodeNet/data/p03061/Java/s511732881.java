import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main  implements Runnable { //Runnableを実装する

    public static void main(String[] args) {

        new Thread(null, new Main(), "", 16 * 1024 * 1024).start(); //16MBスタックを確保して実行

    }

    public void run() {
		Scanner sc = new Scanner(System.in);
		//Scanner sc = new Scanner("2 1000000000 1000000000");
		int n = Integer.parseInt(sc.next());
		//int b = Integer.parseInt(sc.next());
		//int t = Integer.parseInt(sc.next());
		//int k = 0;
		//int k = Integer.parseInt(sc.next());
		//String str = sc.next();
		//char c[] = str.toCharArray();
		long a[] = new long[n];
		long max= 1;
		for (int i = 0; i < n; i++)
		{
			a[i]= Long.parseLong(sc.next());
		}
		for(int j = 0; j < n; j++)
		{
			long crmin = 1;
			long crmax;
			if(j != 0) {
				crmax = a[0];
			}
			else
			{
				crmax = a[1];
			}
			for (int i = 1; i < n; i++)
			{
				if(j!=i)
				{
					crmax = gcd(crmax, a[i]);
				}
				else
				{
					
				}
			}
			if(max < crmax)
			{
				max = crmax;
			}
		}
		long ans = max;

		PrintWriter out = new PrintWriter(System.out);
		out.println(ans);
		out.flush();
	}
    private static long gcd(long m, long n) {
        if(m < n)
        {
        	return gcd(n, m);
        }
        if(n==0)
        {
        	return m;
        }
        return gcd(n, m % n);
    }
}