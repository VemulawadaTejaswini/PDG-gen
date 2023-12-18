import java.io.*;
import java.util.*;
import java.util.ArrayList;
public class Main{
	public static void main(String [] args){
    // InputStreamReader isr = new InputStreamReader(System.in);
    // BufferedReader br = new BufferedReader(isr);
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long k = sc.nextLong();
		long sumel = 0;
		int flag = 0;
		long ans = 0;
		long a  = 0;
		long b  = 0;
		for(long i = 0; i < n;i++){
			a = sc.nextLong();
			b = sc.nextLong();
			sumel+=b;
			if(sumel>=k&&flag==0)
			{
				ans = a;
				flag = 1;
			}
		}
		if(flag!=0)
		System.out.println(ans);
}
}
