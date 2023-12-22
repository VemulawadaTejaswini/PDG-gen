import java.util.*;
import java.math.BigInteger;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long[] ret = new long[N];
		long piyo = 1;
		for(int i = 0; i < N; i++){
			ret[i] = sc.nextLong();
		}
		for(int i = 0; i < N; i++){
			piyo = piyo * ret[i] 
		}
		if(ret > 1000000000000000000L || ret < 0){
			ret = -1;
		}
		System.out.print(ret);
	}
}

