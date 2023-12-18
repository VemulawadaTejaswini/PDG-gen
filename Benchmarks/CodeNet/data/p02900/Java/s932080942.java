import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String args[]){//double 处理果盘
		Scanner in = new Scanner(System.in);
		int a = in.nextInt(),b = in.nextInt();
		long g = gcd(a,b);
		long ans = 0;
		for (long i= 2;i<=g/i;i++){
			if(g % i == 0){
				++ans;
				while(g % i == 0) g/=i;
			}
		}
		if(g>1) ++ans;
		System.out.println(ans+1);
	}

	
	private static long gcd(long x,long y){
		if (y == 0) return x;
		return gcd(y,x%y);
	}
}