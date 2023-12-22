import java.util.*;
import java.math.BigInteger;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long ret = sc.nextLong();
		System.out.print(hoge * 10);
		for(int i = 0; i < N - 1; i++){
			ret = ret * sc.nextLong();
		}
		if(ret > 1000000000000000000L){
			ret = -1;
		}
		System.out.print(ret);
	}
}

