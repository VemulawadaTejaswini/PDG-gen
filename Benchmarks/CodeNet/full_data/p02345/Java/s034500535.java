import java.util.*;
public class Main{
	public static final long INF = (long)Math.pow(2,31) - 1L;
	public static boolean check(int n){
		if(n == 1)
			return true;
		else if(n % 2 != 0)
			return false;
		else
			return check(n / 2);
	}
	public static void update(long rmq[], int i, int x, int n){
		i += (n - 1);
		rmq[i] = x;
		if(i == 0)
			return;
		i = (i-1) / 2;
		while(i >= 0){
			long tmp = Math.min(rmq[2*i + 1],rmq[2*i + 2]);
			if(tmp == rmq[i])
				break;
			else{
				rmq[i] = tmp;
				i = (i-1) / 2;
			}
		}
	}
	public static long find(long rmq[], int s, int t, int left, int right, int i){
		if(right <= s || left > t)
			return INF;
		else if(left >= s && right <= t+1)
			return rmq[i];
		else{
			return Math.min(find(rmq,s,t,left,(left+right)/2, 2*i+1),find(rmq,s,t,(left+right)/2,right,2*i+2));
		}
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int n_ = n;
		while(!check(n_))
			n_++;
		int q = sc.nextInt();
		long rmq[] = new long[2*n_ - 1];
		for(int i = 0 ; i < 2*n_ - 1 ; i++)
			rmq[i] = INF;
		for(int i = 0 ;i < q ; i++){
			int com = sc.nextInt();
			int x = sc.nextInt();
			int y = sc.nextInt();
			switch(com){
				case 0: update(rmq,x,y,n_); break;
				case 1: System.out.println(find(rmq,x,y,0,n_,0)); break;
			}
		}
	}
}
