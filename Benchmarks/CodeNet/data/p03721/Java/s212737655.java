import java.io.*;
import java.util.*;
import java.util.ArrayList;
public class Main{
	public static void main(String [] args){
    // InputStreamReader isr = new InputStreamReader(System.in);
    // BufferedReader br = new BufferedReader(isr);
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		if(n>0&&n<=100000){
		long k = sc.nextLong();
		long sumel = 0;
		int flag = 0;
		int ans = 0;
		int a  = 0;
		int b  = 0;
		for(int i = 0; i < n;i++){
			a = sc.nextInt();
			b = sc.nextInt();
			sumel+=b;
			if(sumel>=k&&flag==0)
			{
				ans = a;
				flag = 1;
			}
		}
		System.out.println(ans);
}
}
}
