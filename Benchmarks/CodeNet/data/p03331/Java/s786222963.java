import java.util.*;
 
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int ans = Integer.MAX_VALUE;
		for(int a=1;a<N;++a){
			int b = N-a;
			int num = digits(a)+digits(b);
			if(num<ans) ans = num;
		}
		System.out.println(ans);
		return;
	}
	
	public static int digits(int a){
		int ret = 0;
		int x = a;
		while(x!=0){
			ret += x%10;
			x/=10;
		}
		return ret;
	}
}