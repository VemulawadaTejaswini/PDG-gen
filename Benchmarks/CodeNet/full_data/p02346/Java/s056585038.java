import java.util.*;
//セグメント木
public class Main{
	public static boolean check(int n){
		if(n == 1)
			return true;
		else if(n % 2 != 0)
			return false;
		else
			return check(n / 2);
	}
	public static void add(long rsq[], int i, int x, int n){
		i += (n - 1);
		rsq[i] += x;
		if(i == 0)
			return;
		i = (i-1) / 2;
		while(i >= 0){
			rsq[i] += x;
			i = (i-1)/2;
                        if(i == 0)
				break;
		}
	}
	public static long getSum(long rsq[], int s, int t, int left, int right, int i){
		if(right <= s || left > t)
			return 0;
		else if(left >= s && right <= t+1)
			return rsq[i];
		else
			return getSum(rsq,s,t,left,(left+right)/2,2*i+1) + getSum(rsq,s,t,(left+right)/2,right,2*i+2);
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int n_ = n;
		while(!check(n_))
			n_++;
		int q = sc.nextInt();
		long rsq[] = new long[2*n_ - 1];
		for(int i = 0 ; i < 2*n_ - 1 ; i++)
			rsq[i] = 0L;
		for(int i = 0 ;i < q ; i++){
			int com = sc.nextInt();
			int x = sc.nextInt();
			int y = sc.nextInt();
			switch(com){
				case 0: add(rsq,x-1,y,n_); break;
				case 1: System.out.println(getSum(rsq,x-1,y-1,0,n_,0)); break;
			}
		}
	}
}
