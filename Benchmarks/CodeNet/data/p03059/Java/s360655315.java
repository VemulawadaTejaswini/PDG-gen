import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main  implements Runnable { //Runnableを実装する

    public static void main(String[] args) {

        new Thread(null, new Main(), "", 16 * 1024 * 1024).start(); //16MBスタックを確保して実行

    }

    public void run() {
		Scanner sc = new Scanner(System.in);
		//Scanner sc = new Scanner("3 12 15 18");
		int n = Integer.parseInt(sc.next());
		//int b = Integer.parseInt(sc.next());
		//int t = Integer.parseInt(sc.next());
		//int k = 0;
		//int k = Integer.parseInt(sc.next());
		//String str = sc.next();
		//char c[] = str.toCharArray();
		int a[] = new int[n];
		int max= 1;
		int max2=1;
		for (int i = 0; i < n; i++)
		{
			a[i]= Integer.parseInt(sc.next());
		}
		int tmp = 1;
		for(int j = 0; j < n; j++)
		{
			int crmin = 1;
			int crmax;
			if(j > 1) {
				crmax = gcd(tmp,a[j-1]);
				
			}
			else if (j == 1)
			{
				crmax = a[0];
				tmp = a[0];
			}
			else
			{
				crmax = a[1];
				tmp = a[1];
			}
			for (int i = j; i < n; i++)
			{
				if(j!=i)
				{
					crmax = gcd(a[i], crmax);
				}
				else
				{
					tmp = crmax;
				}
			}
			if(max < crmax)
			{
				max = crmax;
			}
		}

		int ans = max;

		

		PrintWriter out = new PrintWriter(System.out);
		out.println(ans);
		out.flush();
	}
    private static int gcd(int m, int n) {
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