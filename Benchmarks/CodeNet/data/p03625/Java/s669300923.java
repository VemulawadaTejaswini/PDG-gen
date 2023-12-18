import java.util.*;
import java.io.*;
import java.math.*;
public class Main{
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		PrintWriter ou = new PrintWriter(System.out);
		int n = Integer.parseInt(sc.next());
		int[] a = new int[n];
		for(int i = 0 ; i < n ; i++) a[i] = Integer.parseInt(sc.next());
		sc.close();
		Arrays.sort(a);
		long aa = 0 , bb = 0;
		int now = n - 1;
		while(now > 0 && a[now] != a[now - 1]) now--;
		aa = a[now];
		now -= 2;
		if(now == 0) ou.println(0);
		else{
			while(now > 0 && a[now] != a[now - 1]) now--;
			if(now >= 0) bb = a[now];
			ou.println(aa * bb);
		}
		ou.flush();
	}
}