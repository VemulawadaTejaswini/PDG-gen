import java.util.*;
public class Main{

	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int min = 12;
		long n = scan.nextLong();
		if(n<10){System.out.println(1);}
		else{
		int k = (int)Math.sqrt(n);
		for(long i=1; i<k+1; i++){
			if(n%i==0){
				long j = n/i;
				int keta = f(i,j);
				if(keta<min){
					min = keta;
				}
			}
		}
		System.out.println(min);}
	}

	//F(A,B)を求めるメソッド
	public static int f(long a,long b){
		int aketa = 0;
		int bketa = 0;
		int cketa = 0;
		for(int i=1; i<11; i++){
			long xx = (long)Math.pow(10,i);
			long x = a/xx;
			long y = b/xx;
			if(x>=1&&x<10){
				aketa = i+1;
			}
			if(y>=1&&y<10){
				bketa = i+1;
			}
		}
		cketa = Math.max(aketa,bketa);
		return cketa;
	}
}