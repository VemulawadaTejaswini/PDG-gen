import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		long n = sc.nextLong();
		double  sqrt = Math.sqrt(n);
		long i = Math.round(sqrt);
		long  r = 0;
		long  t = 0;
		boolean f = false;
		long  temp = 0;
		long  mint = 0;
		long  minc = 0;
		long  min = -1;
		//判定
		for(long  c = i ; c >= 1; c-=2){
			t = n / c;
			r = n % c;
			 if(r == 0){
				 temp = t + c -2;
				 if(min == -1){
					 min = temp;
					 f = true;
				 }
				 else if (temp <= min){
					 min = temp;
					 f = true;
				 }
			 }
		}
		//出力文字決定
		if(f){
		System.out.println(min);
	}else{
		System.out.println(n - 1);
	}
}
}
