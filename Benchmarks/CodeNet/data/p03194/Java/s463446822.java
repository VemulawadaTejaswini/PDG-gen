import java.util.*;
public class Main {
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	// 整数の入力
	long n = sc.nextLong();
	long p = sc.nextLong();

	double ans_d = Math.pow(p, 1/(double)n);
	long ans = (long)ans_d + 1;
	long ans_n;

	for ( ;; ){
	    ans_n = 1;
	    for(int i = 1; i <= n; i++){
		ans_n *= ans;
	    }
	    if (p % ans_n == 0){
		break;
	    }
	    ans--;
	}

	System.out.println(ans);
    }
}



