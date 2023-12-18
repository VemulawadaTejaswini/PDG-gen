import java.util.*;
import java.math.*;
import java.lang.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		long l = sc.nextLong();
		long r = sc.nextLong();
		long CONST_YEAR = 2019l;
		long resultMod =2019l;

		for (long i = l; i < r; i++) {
			for (long j = i+1; j <= r; j++) {
				long result = i*j;
				long mod = result % CONST_YEAR;
				if(mod == 0l){
					resultMod =0;
					break;
				}
				resultMod =Math.min(mod, resultMod);
			}
			if(resultMod==0l){
				break;
			}
		}

		System.out.println(resultMod);

	}

}
