import java.util.*;
public class Main {
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	// 整数の入力
	long n = sc.nextLong();
	long p = sc.nextLong();
 
	double ans_d = Math.pow(p, 1/(double)n);
	long ans = (long)ans_d + 1;

	long work;
 
	boolean solved = false;
	
	for ( ;; ){
	    work = p;
	    for(int i = 1; i <= n; i++){
		if(work % ans != 0){
		    break;
		}
		if(i == n){
		    solved = true;
		}
		work /= ans;
	    }
	    if (solved){
		break;
	    }
	    ans--;
	}
 
	System.out.println(ans);
    }
}
 