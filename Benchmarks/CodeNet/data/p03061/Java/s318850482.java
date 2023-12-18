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
		int left[] = new int[n];
		int right[] = new int[n];
		int crmin = 1;
		int crmax;
		for (int i = 1; i < n; i++)
		{
			if(i==1)
			{
				left[i]=a[i-1];
				right[i]=a[n-1-i+1];
			}
			else
			{
				left[i]=gcd(a[i-1], left[i-1]);
				right[i]=gcd(a[n-1-i+1], right[i-1]);
			}
		}
		for(int j = 0; j < n; j++)
		{

			if(j == 0) {
				crmax = right[n-1];
			}
			else if (j == n-1)
			{
				crmax = left[n-1];
			}
			else
			{
				crmax = gcd(left[j], right[n-j]);
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