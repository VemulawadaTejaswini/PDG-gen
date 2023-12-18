import java.util.*;
import java.util.Arrays;

public class Main{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		long m = x;
		long ans = 0;
		long money = 100;
		while(money<m){
			money=money+(long)(money*0.01);
			ans++;

			

		}
		System.out.println(ans);
		
		
	}
}









