
import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        int a[] = new int[100002];
        int c[] = new int[100002];
        for(int i = 1; i <= n; i++)
        {
            a[i] = sc.nextInt();
        }
        for(int i = 1; i <= n + 1; i++)
        {
        	c[i] = Math.abs(a[i - 1] - a[i]) + c[i - 1];
        }
        
        for(int i = 1; i <= n; i++)
        {
        	System.out.println(c[i - 1] + Math.abs(a[i - 1] - a[i + 1]) + (c[n + 1] - c[i + 1]));
        }
	}
}